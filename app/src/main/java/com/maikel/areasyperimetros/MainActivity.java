package com.maikel.areasyperimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView cuadrado, rectangulo, triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuadrado = findViewById(R.id.imageViewCuadrado);
        rectangulo = findViewById(R.id.imageViewRectangulo);
        triangulo = findViewById(R.id.imageViewTriangulo);
    }
    public void goToCuadrado(View view){
        Toast.makeText(this, "Estas en al figura cuadrado", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ActivityCuadrado.class);
        startActivity(intent);
    }
    public void goToRectangulo(View view){
        Toast.makeText(this, "Estas en al figura rectangulo", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this, ActivityRectangulo.class);
        startActivity(intent1);
    }
    public void goToTriangulo(View view){
        Toast.makeText(this, "Estas en al figura triangulo", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this, ActivityTriangulo.class);
        startActivity(intent1);
    }
}