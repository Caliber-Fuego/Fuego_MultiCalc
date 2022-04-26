package com.example.fuego_physicscalculator.View.PhysicsFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fuego_physicscalculator.Controller.Calculations;
import com.example.fuego_physicscalculator.R;

public class PhysicsFragment1 extends Fragment {

    Calculations calc = new Calculations();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_physics1, container, false);
        Button solvebtn           = (Button) v.findViewById(R.id.solvebutton2);
        ImageView formuladisplay  = (ImageView) v.findViewById(R.id.physicsformula);

        TextView variable1        = (TextView) v.findViewById(R.id.var1display);
        TextView variable2        = (TextView) v.findViewById(R.id.var2display);
        TextView var2displayunit1 = (TextView) v.findViewById(R.id.var2displayunit1);
        TextView var2displayunit2 = (TextView) v.findViewById(R.id.var2dusplayunit2);
        TextView variable3        = (TextView) v.findViewById(R.id.var3display);
        TextView varsolve         = (TextView) v.findViewById(R.id.solvequestiondisplay);
        TextView results          = (TextView) v.findViewById(R.id.resultsdisplay2);

        EditText var1edit = (EditText) v.findViewById(R.id.variable1edit);
        EditText var2edit = (EditText) v.findViewById(R.id.variable2edit);
        EditText var3edit = (EditText) v.findViewById(R.id.variable3edit);


        switch (calc.getPhysicsData()){
            case "Freefall":
                varsolve.setText("Solve for h");
                variable1.setText("Gravitational Acceleration (g)");
                variable2.setText("Initial Velocity");
                var2displayunit1.setText("0");
                var2displayunit2.setText("(V )");
                variable3.setText("Time of Fall (t)");
                var2displayunit1.setVisibility(View.VISIBLE);
                var2displayunit2.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.VISIBLE);
                formuladisplay.setImageResource(R.drawable.formula_freefalldistance);
                break;
            case "Velocity":
                varsolve.setText("Solve for Speed (s)");
                variable1.setText("Distance  (d)");
                variable2.setText("Time (t)");
                var2displayunit1.setVisibility(View.INVISIBLE);
                var2displayunit2.setVisibility(View.INVISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
                var1edit.setText("0");
                formuladisplay.setImageResource(R.drawable.formula_speed);
                break;
            case "Circular":
                varsolve.setText("Solve for Centripetal Acceleration (Ac)");
                variable1.setText("Tangential Velocity (Vt)");
                variable2.setText("Radius (r)");
                var2displayunit1.setVisibility(View.INVISIBLE);
                var2displayunit2.setVisibility(View.INVISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
                var1edit.setText("0");
                varsolve.setTextSize(12);
                formuladisplay.setImageResource(R.drawable.formula_centripetalaccel);
                break;
        }

        solvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getPhysicsData()) {
                    case "Freefall":
                        calc.freefalldistance(var1edit, var3edit, results);
                        break;
                    case "Velocity":
                        calc.velocitynormal(var1edit, var2edit, results);
                        break;
                    case "Circular":
                        calc.circularacceleration(var1edit, var2edit, results);
                        break;
                }
            }
        });
        return v;
    }
}