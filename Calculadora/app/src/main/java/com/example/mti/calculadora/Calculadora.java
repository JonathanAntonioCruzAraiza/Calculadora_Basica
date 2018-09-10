package com.example.mti.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    private EditText etUno,etDos,etRes;
    private Button btnSuma,btnResta,btnDivicion,btnMultiplicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
         etUno              = (EditText)findViewById(R.id.etUno);
         etDos              = (EditText)findViewById(R.id.etDos);
         etRes              = (EditText)findViewById(R.id.etResultado);
         btnSuma            = (Button)findViewById(R.id.btnSumar);
         btnResta           = (Button)findViewById(R.id.btnRestar);
         btnDivicion        = (Button)findViewById(R.id.btnDividir);
         btnMultiplicacion  = (Button)findViewById(R.id.btnMultiplicar);

        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnDivicion.setOnClickListener(this);
        btnMultiplicacion.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    double datoUno = Double.parseDouble(etUno.getText().toString());
    double datoDos = Double.parseDouble(etDos.getText().toString());
    double resultado = 0;
    switch (v.getId()){
            case R.id.btnSumar:
                resultado = datoUno+datoDos;
                etRes.setText( "Resultado_"+resultado);
            break;
        case R.id.btnRestar:
                resultado = datoUno-datoDos;
                etRes.setText( "Resultado"+resultado);
            break;
        case R.id.btnDividir:
                resultado = datoUno/datoDos;
                etRes.setText( "Resultado"+resultado);
            break;
        case R.id.btnMultiplicar:
                resultado = datoUno*datoDos;
                etRes.setText( "Resultado"+resultado);
            break;
    }

    }
}
