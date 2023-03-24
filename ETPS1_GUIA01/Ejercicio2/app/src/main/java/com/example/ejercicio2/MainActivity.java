package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edCantidad;
TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TexView
        edCantidad=findViewById(R.id.edtCantidad);
        //EditText
        tvResultado=findViewById(R.id.txtResultado);


    }

    public void btnRespuesta(View v){
        double N1,IVA = 0.134;
        double Datos, Respuesta;

        N1=Double.parseDouble(edCantidad.getText().toString());
        Datos = N1*IVA;
        Respuesta =Datos+N1;

        tvResultado.setText("El Precio con IVA del producto es:" +String.valueOf(Respuesta));
    }
}