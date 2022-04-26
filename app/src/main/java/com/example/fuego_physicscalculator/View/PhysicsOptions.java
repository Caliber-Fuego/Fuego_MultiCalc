package com.example.fuego_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fuego_physicscalculator.Controller.Calculations;
import com.example.fuego_physicscalculator.R;

public class PhysicsOptions extends AppCompatActivity {

    Calculations calc = new Calculations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_options);
    }


    public void backButton (View v){
        finish();
    }

    public void gotoVelocity (View view){
        Intent openGeometry = new Intent(this, PhysicsActivity.class);
        startActivity(openGeometry);
        calc.setPhysicsData("Velocity");
    }
    public void gotoFreefall (View view){
        Intent openGeometry = new Intent(this, PhysicsActivity.class);
        startActivity(openGeometry);
        calc.setPhysicsData("Freefall");
    }
    public void gotoCircular (View view){
        Intent openGeometry = new Intent(this, PhysicsActivity.class);
        startActivity(openGeometry);
        calc.setPhysicsData("Circular");
    }
}