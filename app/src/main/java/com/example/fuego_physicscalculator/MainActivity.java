package com.example.fuego_physicscalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.ViewPager2);

        tabs.setupWithViewPager(viewPager);

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragAdapter.addFragment(new AreaFormulas(), "Area");
        fragAdapter.addFragment(new VolumeFormulas(), "Volume");
        viewPager.setAdapter(fragAdapter);

    }
}