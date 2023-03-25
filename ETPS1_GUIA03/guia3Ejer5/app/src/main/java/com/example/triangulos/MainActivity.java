package com.example.triangulos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText lado1, lado2, lado3;
    Button enviar;
    ImageView imagen;

    TextView tipoTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lado1 = findViewById(R.id.lado1);
        lado2 = findViewById(R.id.lado2);
        lado3 = findViewById(R.id.lado3);
        enviar = findViewById(R.id.button);
        imagen = findViewById(R.id.imageView);
        tipoTriangulo = findViewById(R.id.textView);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lado1Str = lado1.getText().toString();
                String lado2Str = lado2.getText().toString();
                String lado3Str = lado3.getText().toString();

                if(lado1Str.isEmpty() || lado2Str.isEmpty() || lado3Str.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Por favor ingrese los tres lados del triángulo", Toast.LENGTH_SHORT).show();
                }
                else{
                    double a = Double.parseDouble(lado1Str);
                    double b = Double.parseDouble(lado2Str);
                    double c = Double.parseDouble(lado3Str);

                    if((a + b > c) && (a + c > b) && (b + c > a)){
                        if(a == b && b == c){
                            imagen.setImageResource(R.drawable.equilatero);
                            tipoTriangulo.setText("Tipo de triángulo: Equilátero");
                        }
                        else if(a == b || a == c || b == c){
                            imagen.setImageResource(R.drawable.isosceles);
                            tipoTriangulo.setText("Tipo de triángulo: Isósceles");
                        }
                        else{
                            imagen.setImageResource(R.drawable.escaleno);
                            tipoTriangulo.setText("Tipo de triángulo: Escaleno");
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Los lados ingresados no forman un triángulo válido", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
