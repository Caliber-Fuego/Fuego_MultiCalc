package com.example.fuego_physicscalculator.Controller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fuego_physicscalculator.View.PhysicsFragments.PhysicsFragment1;
import com.example.fuego_physicscalculator.View.PhysicsFragments.PhysicsFragment2;
import com.example.fuego_physicscalculator.View.PhysicsFragments.PhysicsFragment3;

public class PhysicsFragAdapter extends FragmentStateAdapter {

    private String[] titles1 = new String[]{"Free Fall Distance", "Time of Fall", "Final Velocity"};

    public PhysicsFragAdapter (@NonNull FragmentActivity fragmentActivity){
        super (fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position){
        switch (position){
            case 0:
                return new PhysicsFragment1();
            case 1:
                return new PhysicsFragment2();
            case 2:
                return new PhysicsFragment3();
        }
        return new PhysicsFragment1();
    }

    @Override
    public int getItemCount() {
        return titles1.length;
    }
}
