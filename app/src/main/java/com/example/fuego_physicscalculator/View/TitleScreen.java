package com.example.fuego_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fuego_physicscalculator.R;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
    }
    public void goToGeometry (View view){
        Intent openGeometry = new Intent(this, GeometryOptions.class);
        startActivity(openGeometry);
    }

    public void goToPhysics (View view){
        Intent openPhysics = new Intent(this, PhysicsOptions.class);
        startActivity(openPhysics);
    }
}