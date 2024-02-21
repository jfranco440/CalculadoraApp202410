package com.franco.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1, etNUM2;
    private TextView tvResultado;
    private Button btn_Sumar, btn_Restar, btn_Multiplicar, btn_Dividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Sumar = findViewById(R.id.btn_sumar);
        btn_Restar = findViewById(R.id.btn_restar);
        btn_Multiplicar = findViewById(R.id.btn_multiplicar);
        btn_Dividir = findViewById(R.id.btn_dividir);


        etNum1 = findViewById(R.id.et_valor1);
        etNUM2 = findViewById(R.id.et_valor2);
        tvResultado = findViewById(R.id.txt_resultado);



    }

    public void clickSumar(View miviewcita){

        String num1String = etNum1.getText().toString();
        Double num1 = Double.parseDouble(num1String);

        String num2String = etNUM2.getText().toString();
        Double num2 =Double.parseDouble(num2String);

        Double resultado = num1 + num2;

        tvResultado.setText(resultado.toString());

        Toast.makeText(this, "LE DI CLICK A SUMAR", Toast.LENGTH_SHORT).show();
    }


}