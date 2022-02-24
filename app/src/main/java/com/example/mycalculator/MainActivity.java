package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberA, numberB;
    Button btn_sum, btn_subtract, btn_multiply, btn_divid;
    TextView natija;

    float a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA=findViewById(R.id.numberA);
        numberB=findViewById(R.id.numberB);

        btn_sum=findViewById(R.id.sum);
        btn_subtract=findViewById(R.id.subtract);
        btn_multiply=findViewById(R.id.multiply);
        btn_divid=findViewById(R.id.Divid);

        natija=findViewById(R.id.natija);

        // Buttons
        btn_sum.setOnClickListener(v -> {
            a=Integer.parseInt(numberA.getText().toString());
            b=Integer.parseInt(numberB.getText().toString());

            float sum = a+b;

            natija.setText(sum+"");

        });

        btn_subtract.setOnClickListener(v -> {
            a=Integer.parseInt(numberA.getText().toString());
            b=Integer.parseInt(numberB.getText().toString());

            float subtract = a-b;

            natija.setText(subtract+"");
        });

        btn_multiply.setOnClickListener(v -> {
            a=Integer.parseInt(numberA.getText().toString());
            b=Integer.parseInt(numberB.getText().toString());

            float multiply = a*b;

            natija.setText(multiply+"");
        });

        btn_divid.setOnClickListener(v -> {
            a=Integer.parseInt(numberA.getText().toString());
            b=Integer.parseInt(numberB.getText().toString());

            float divid = a/b;

            natija.setText(divid+"");
        });

    }
}