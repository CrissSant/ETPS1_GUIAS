package sv.edu.utec.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner spnOperacion;
EditText edN1, edN2;
TextView edRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //EditText
        edN1=findViewById(R.id.edtNumero1);
        edN2=findViewById(R.id.edtNumero2);

        //TextView
        edRes=findViewById(R.id.txvResultado);

        //Spinner
        spnOperacion=findViewById(R.id.spnOperacion);

        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item ){

            public View getView(int posicion, View contenido, ViewGroup parent){
                View vista=super.getView(posicion,contenido,parent);
                if (posicion==getCount()){
                    ((TextView)vista.findViewById(android.R.id.text1)).setText("");
                    ((TextView)vista.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
                }

                return vista;
            }
            public int getCount(){
                return super.getCount()-1;//DESCONTARA UN ELEMNET DEL SPINNER
            }

        };
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adaptador.add("Suma +");
        adaptador.add("Resta -");
        adaptador.add("Multiplicacion *");
        adaptador.add( "Division /");
        adaptador.add("Seleccione una operacion");//ESTE ELEMENTO ES EL QUE VA A DESCONTAR DEL SPINNER
        spnOperacion.setAdapter(adaptador);
        spnOperacion.setSelection(adaptador.getCount());

    }

        public void Respuesta(View v){
            double N1,N2,Result= 0;
            Double Datos;

            String seleccion=spnOperacion.getSelectedItem().toString();
            N1=Double.parseDouble(edN1.getText().toString());
            N2=Double.parseDouble(edN2.getText().toString());


        if(seleccion.equals("Seleccione una operacion")){
            edRes.setText("Seleccione una operacion");

        }
        else if(seleccion.equals("Suma +")){
            Datos=N1+N2;
            edRes.append("La suma es: "+ String.valueOf(Datos));
        }
        else if(seleccion.equals("Resta -")){
            Datos=N1-N2;
            edRes.append("La resta es: "+ String.valueOf(Datos));
        }
        else if(seleccion.equals("Multiplicacion *")){
            Datos=N1*N2;
            edRes.append("La Multiplicacion es: "+ String.valueOf(Datos));
        }
        else if(seleccion.equals("Division /")){
            Datos=N1/N2;
            edRes.append("La division es: "+ String.valueOf(Datos));
            }
            edRes.append(String.valueOf(Result));
        }


}

