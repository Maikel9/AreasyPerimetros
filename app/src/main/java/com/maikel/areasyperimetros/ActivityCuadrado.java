package com.maikel.areasyperimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityCuadrado extends AppCompatActivity {
    EditText lado;
    TextView resultado;
    Button calcular, atras, limpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lado = findViewById(R.id.editTextLado);
        resultado = findViewById(R.id.textViewRespuesta);
        calcular = findViewById(R.id.button);
        atras = findViewById(R.id.btnAtrasC);
        limpiar = findViewById(R.id.btnLimipiarC);
    }
    public void respuesta(View view){
        String valor = lado.getText().toString();

        int ladoint = Integer.parseInt(valor);
        int area = ladoint *ladoint;
        int perimetro = ladoint*4;

        String resultadoperimetro = String.valueOf(perimetro);
        String resultadoarea = String.valueOf(area);
        resultado.setText("Area: "+resultadoarea+"\nPerimetro: "+resultadoperimetro);
    }
    public void regresar(View view){
        Toast.makeText(this, "Regresaste al inicio", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void limpiarPantalla(View view){
        Toast.makeText(this, "Se limpio la pantalla", Toast.LENGTH_SHORT).show();
        lado.setText("");
        resultado.setText("Respuesta");
    }
}