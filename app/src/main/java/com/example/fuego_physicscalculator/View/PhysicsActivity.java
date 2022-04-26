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
    private String[] titles2 = new String[]{"Speed", "Velocity", "Acceleration"};
    private String[] titles3 = new String[]{"Centripetal Acceleration", "Angular Frequency", "Tangential Velocity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        getSupportActionBar().hide();
        tabs = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.ViewPager2);
        fragAdapter = new PhysicsFragAdapter(this);

        viewPager.setAdapter(fragAdapter);

        switch(calc.getPhysicsData()){
            case "Velocity":
                new TabLayoutMediator(tabs, viewPager,((tab, position) -> tab.setText(titles2[position]))).attach();
                break;
            case "Freefall":
                new TabLayoutMediator(tabs, viewPager,((tab, position) -> tab.setText(titles1[position]))).attach();
                break;
            case "Circular":
                new TabLayoutMediator(tabs, viewPager,((tab, position) -> tab.setText(titles3[position]))).attach();
                break;

        }
    }

    public void backButton (View v){
        finish();
    }

}