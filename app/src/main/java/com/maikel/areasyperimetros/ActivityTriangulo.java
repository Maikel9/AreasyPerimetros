package com.maikel.areasyperimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTriangulo extends AppCompatActivity {
    EditText base, altura, lado;
    Button calcular, atras, limpiar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        base = findViewById(R.id.editTextBase);
        altura = findViewById(R.id.editTextaltura);
        lado = findViewById(R.id.editTextladoT);
        calcular = findViewById(R.id.btnCalcularT);
        atras = findViewById(R.id.btnAtrasR);
        limpiar = findViewById(R.id.btnLimipiarR);
        resultado = findViewById(R.id.textViewRespuestaT);
    }
    public void calculo(View view){
        String num1 = base.getText().toString();
        String num2 = altura.getText().toString();
        String num3 = lado.getText().toString();

        int baseint = Integer.parseInt(num1);
        int alturaint = Integer.parseInt(num2);
        int ladoint = Integer.parseInt(num3);

        int perimetro=(ladoint+ladoint+ladoint);
        int area = (baseint*alturaint)/2;
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
        base.setText("");
        altura.setText("");
        lado.setText("");
        resultado.setText("Respuesta");
    }
}