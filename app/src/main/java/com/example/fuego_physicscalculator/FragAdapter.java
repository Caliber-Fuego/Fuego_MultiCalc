package com.example.fuego_physicscalculator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class FragAdapter extends FragmentStateAdapter {

    //Sets the title for each tabs
    private String[] titles= new String[]{"Area", "Volume"};

    //Constructor for Fragment Activity
    public FragAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //Allows the switching of tabs
        switch (position){
            case 0:
                return new AreaFormulas();
            case 1:
                return new VolumeFormulas();
        }
        return new AreaFormulas();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
