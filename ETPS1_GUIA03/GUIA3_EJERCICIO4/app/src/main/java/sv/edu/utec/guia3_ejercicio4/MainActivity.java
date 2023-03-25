package sv.edu.utec.guia3_ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edN1,edN2,edN3,edN4,edN5,edN6,edN7,edN8,edN9,edN10;
TextView tvNeg, tvPos, tvmulti, tvacum;

Button btCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Editext
        edN1=findViewById(R.id.edtN1);
        edN2=findViewById(R.id.edtN2);
        edN3=findViewById(R.id.edtN3);
        edN4=findViewById(R.id.edtN4);
        edN5=findViewById(R.id.edtN5);
        edN6=findViewById(R.id.edtN6);
        edN7=findViewById(R.id.edtN7);
        edN8=findViewById(R.id.edtN8);
        edN9=findViewById(R.id.edtN9);
        edN10=findViewById(R.id.edtN10);

        //TextView
        tvNeg=findViewById(R.id.txvNegativos);
        tvPos=findViewById(R.id.txvPositivos);
        tvmulti=findViewById(R.id.txvMultiplos);
        tvacum=findViewById(R.id.txvAcumulado);

        btCalcular=findViewById(R.id.btnCalcular);

    }

    public void btCalcular(View view){
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
        int negativeCount=0, positiveCount=0,multipleOf15Count=0, evenSum=0;

        n1=Integer.parseInt(edN1.getText().toString());
        n2=Integer.parseInt(edN2.getText().toString());
        n3=Integer.parseInt(edN3.getText().toString());
        n4=Integer.parseInt(edN4.getText().toString());
        n5=Integer.parseInt(edN5.getText().toString());
        n6=Integer.parseInt(edN6.getText().toString());
        n7=Integer.parseInt(edN7.getText().toString());
        n8=Integer.parseInt(edN8.getText().toString());
        n9=Integer.parseInt(edN9.getText().toString());
        n10=Integer.parseInt(edN10.getText().toString());

        /*negativeCount=Integer.parseInt(tvNeg.getText().toString());
        positiveCount=Integer.parseInt(tvPos.getText().toString());
        multipleOf15Count=Integer.parseInt(tvmulti.getText().toString());
        evenSum=Integer.parseInt(tvacum.getText().toString());*/

        if (n1 < 0) {
            negativeCount++;
        } else if (n1 > 0) {
            positiveCount++;
        }
        if (n1 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n1 % 2 == 0) {
            evenSum += n1;
        }

        if (n2 < 0) {
            negativeCount++;
        } else if (n2 > 0) {
            positiveCount++;
        }
        if (n2 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n2 % 2 == 0) {
            evenSum += n2;
        }

        if (n3 < 0) {
            negativeCount++;
        } else if (n3 > 0) {
            positiveCount++;
        }
        if (n3 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n3 % 2 == 0) {
            evenSum += n3;
        }

        if (n4 < 0) {
            negativeCount++;
        } else if (n4 > 0) {
            positiveCount++;
        }
        if (n4 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n4 % 2 == 0) {
            evenSum += n4;
        }

        if (n5 < 0) {
            negativeCount++;
        } else if (n5 > 0) {
            positiveCount++;
        }
        if (n5 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n5 % 2 == 0) {
            evenSum += n5;
        }

        if (n6 < 0) {
            negativeCount++;
        } else if (n6 > 0) {
            positiveCount++;
        }
        if (n6 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n6 % 2 == 0) {
            evenSum += n6;
        }

        if (n7 < 0) {
            negativeCount++;
        } else if (n7 > 0) {
            positiveCount++;
        }
        if (n7 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n7 % 2 == 0) {
            evenSum += n7;
        }
        //
        if (n8 < 0) {
            negativeCount++;
        } else if (n8 > 0) {
            positiveCount++;
        }
        if (n8 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n8 % 2 == 0) {
            evenSum += n8;
        }

        if (n9 < 0) {
            negativeCount++;
        } else if (n9 > 0) {
            positiveCount++;
        }
        if (n9 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n9 % 2 == 0) {
            evenSum += n9;
        }

        if (n10 < 0) {
            negativeCount++;
        } else if (n10 > 0) {
            positiveCount++;
        }
        if (n10 % 15 == 0) {
            multipleOf15Count++;
        }
        if (n10 % 2 == 0) {
            evenSum += n10;
        }
        tvNeg.append("Numeros negativos: "+String.valueOf(negativeCount));
        tvPos.append("Numeros positivos: "+String.valueOf(positiveCount));
        tvmulti.append("Numeros multiplos de 15: "+String.valueOf(multipleOf15Count));
        tvacum.append("Numeros acumulados pares: "+String.valueOf(evenSum));
    }
}