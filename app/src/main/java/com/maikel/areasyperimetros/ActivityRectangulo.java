package com.maikel.areasyperimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityRectangulo extends AppCompatActivity {
    EditText ancho, largo;
    Button calcular, atras, limpiar;
    TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        ancho = findViewById(R.id.editTextAncho);
        largo = findViewById(R.id.editTextlargo);
        calcular = findViewById(R.id.btnCalcularR);
        atras = findViewById(R.id.btnAtrasR);
        limpiar = findViewById(R.id.btnLimipiarR);
        respuesta = findViewById(R.id.textViewRespuestaR);
    }
    public void calculo(View view){
        String num1 = ancho.getText().toString();
        String num2 = largo.getText().toString();
        int anchoint = Integer.parseInt(num1);
        int largoint = Integer.parseInt(num2);
        int perimetro=2*(anchoint+largoint);
        int area = (anchoint*largoint);
        String resultadoperimetro = String.valueOf(perimetro);
        String resultadoarea = String.valueOf(area);
        respuesta.setText("Area: "+resultadoarea+"\nPerimetro: "+resultadoperimetro);
    }
    public void regresar(View view){
        Toast.makeText(this, "Regresaste al inicio", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void limpiarPantalla(View view){
        Toast.makeText(this, "Se limpio la pantalla", Toast.LENGTH_SHORT).show();
        ancho.setText("");
        largo.setText("");
        respuesta.setText("Respuesta");
    }
}