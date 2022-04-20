package com.example.fuego_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.fuego_physicscalculator.Controller.FragAdapter;
import com.example.fuego_physicscalculator.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    FragAdapter fragAdapter;

    private TabLayout tabs;
    private ViewPager2 viewPager;

    private String[] titles= new String[]{"Area", "Volume"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tabs = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.ViewPager2);
        fragAdapter = new FragAdapter(this);

        viewPager.setAdapter(fragAdapter);
        new TabLayoutMediator(tabs, viewPager,((tab, position) -> tab.setText(titles[position]))).attach();




    }
}