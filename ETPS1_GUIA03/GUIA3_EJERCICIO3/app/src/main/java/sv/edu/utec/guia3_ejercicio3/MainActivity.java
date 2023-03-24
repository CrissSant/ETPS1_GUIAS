package sv.edu.utec.guia3_ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;

TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.edt1);
        n2=findViewById(R.id.edt2);
        n3=findViewById(R.id.edt3);
        n4=findViewById(R.id.edt4);
        n5=findViewById(R.id.edt5);
        n6=findViewById(R.id.edt6);
        n7=findViewById(R.id.edt7);
        n8=findViewById(R.id.edt8);
        n9=findViewById(R.id.edt9);
        n10=findViewById(R.id.edt10);
        Resultado=findViewById(R.id.txvResultado);

    }

    public void Calcular(View v )
    {
        int N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,Suma=0;

        N1=Integer.parseInt(n1.getText().toString());
        N2=Integer.parseInt(n2.getText().toString());
        N3=Integer.parseInt(n3.getText().toString());
        N4=Integer.parseInt(n4.getText().toString());
        N5=Integer.parseInt(n5.getText().toString());
        N6=Integer.parseInt(n6.getText().toString());
        N7=Integer.parseInt(n7.getText().toString());
        N8=Integer.parseInt(n8.getText().toString());
        N9=Integer.parseInt(n9.getText().toString());
        N10=Integer.parseInt(n10.getText().toString());

        Suma=N6+N7+N8+N9+N10;

        Resultado.append(N1+"\n"+N2+"\n"+N3+"\n"+N4+"\n"+N5+"\n"+Suma);


    }
}