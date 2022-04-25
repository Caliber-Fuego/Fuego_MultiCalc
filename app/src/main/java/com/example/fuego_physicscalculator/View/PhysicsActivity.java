package com.example.fuego_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.fuego_physicscalculator.Controller.Calculations;
import com.example.fuego_physicscalculator.Controller.FragAdapter;
import com.example.fuego_physicscalculator.Controller.PhysicsFragAdapter;
import com.example.fuego_physicscalculator.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class PhysicsActivity extends AppCompatActivity {

    PhysicsFragAdapter fragAdapter;
    Calculations calc = new Calculations();

    private TabLayout tabs;
    private ViewPager2 viewPager;

    private String[] titles1 = new String[]{"Free Fall Distance", "Time of Fall", "Final Velocity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        getSupportActionBar().hide();
        tabs = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.ViewPager2);
        fragAdapter = new PhysicsFragAdapter(this);

        viewPager.setAdapter(fragAdapter);
        new TabLayoutMediator(tabs, viewPager,((tab, position) -> tab.setText(titles1[position]))).attach();
    }

    public void backButton (View v){
        finish();
    }

}