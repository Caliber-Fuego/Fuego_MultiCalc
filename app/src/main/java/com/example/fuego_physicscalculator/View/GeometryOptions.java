package com.example.fuego_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fuego_physicscalculator.Controller.Calculations;
import com.example.fuego_physicscalculator.R;

public class GeometryOptions extends AppCompatActivity {

    Calculations calc = new Calculations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_options);


    }
    public void backButton (View v){
        finish();
    }

    public void gotoRectangle (View view){
        Intent openGeometry = new Intent(this, MainActivity.class);
        startActivity(openGeometry);
        calc.setShapeData("Rectangle");
    }
    public void gotoTriangle (View view){
        Intent openGeometry = new Intent(this, MainActivity.class);
        startActivity(openGeometry);
        calc.setShapeData("Triangle");
    }
    public void gotoCircle (View view){
        Intent openGeometry = new Intent(this, MainActivity.class);
        startActivity(openGeometry);
        calc.setShapeData("Circle");
    }
    public void gotoEllipse (View view){
        Intent openGeometry = new Intent(this, MainActivity.class);
        startActivity(openGeometry);
        calc.setShapeData("Ellipse");
    }
}