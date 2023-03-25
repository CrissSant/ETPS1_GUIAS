package com.example.numeros3cifras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberString = editTextNumber.getText().toString();
                if (numberString.length() > 3) {
                    Toast.makeText(MainActivity.this, "El número debe tener hasta tres cifras", Toast.LENGTH_SHORT).show();
                } else {
                    int number = Integer.parseInt(numberString);
                    String message = "";
                    if (number < 10) {
                        message = "El número tiene 1 cifra";
                    } else if (number < 100) {
                        message = "El número tiene 2 cifras";
                    } else {
                        message = "El número tiene 3 cifras";
                    }
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
