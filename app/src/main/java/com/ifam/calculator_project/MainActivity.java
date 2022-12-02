package com.ifam.calculator_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText num1, num2;
    public Button soma, subtracao, multiplicacao, divisao;
    public Button result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
        acaoBotoes();
    }

    public void inicializar(){
        num1 = findViewById(R.id.edt_num1);
        num2 = findViewById(R.id.edt_num2);
        soma = findViewById(R.id.bt_somar);
        subtracao = findViewById(R.id.bt_subtrair);
        multiplicacao = findViewById(R.id.bt_multiplicar);
        divisao = findViewById(R.id.bt_dividir);
    }

    public void acaoBotoes(){
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                somar(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
            }
        });
        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtrair(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
            }
        });
        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicar(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
            }
        });
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dividir(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
            }
        });
    }

    public void somar(Integer num1, Integer num2){
        result.setText(String.valueOf(num1 + num2));
    }

    public void subtrair(Integer num1, Integer num2){
        result.setText(String.valueOf(num1 - num2));
    }

    public void multiplicar(Integer num1, Integer num2){
        result.setText(String.valueOf(num1 * num2));
    }

    public void dividir(Integer num1, Integer num2){
        result.setText(String.valueOf(num1 / num2));
    }
}