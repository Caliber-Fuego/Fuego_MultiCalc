package com.example.fuego_physicscalculator.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fuego_physicscalculator.Controller.Calculations;
import com.example.fuego_physicscalculator.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AreaFormulas extends Fragment {

    private String[] formulas= new String[]{"Rectangle", "Triangle","Parallelogram","Trapezoid","Circle"};

    String shape;
    Calculations calc = new Calculations();

    @Override
    //TODO add Rectangle, Triangle, Parallelogram, Trapezoid, Circle
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_area_formulas, container, false);
        Button rectanglebtn = (Button) v.findViewById(R.id.rectanglebutton);
        Button trianglebtn  = (Button) v.findViewById(R.id.trianglebutton);
        Button circlebtn    = (Button) v.findViewById(R.id.circlebutton);
        Button parallelobtn = (Button) v.findViewById(R.id.parallelogrambutton);
        Button trapezoidbtn = (Button) v.findViewById(R.id.trapezoidbutton);
        Button solvebtn     = (Button) v.findViewById(R.id.solvebutton);

        TextView variable1 = (TextView) v.findViewById(R.id.variable1display);
        TextView variable2 = (TextView) v.findViewById(R.id.variable2display);
        TextView variable3 = (TextView) v.findViewById(R.id.variable3display);
        TextView results   = (TextView) v.findViewById(R.id.resultsdisplay);

        EditText var1edit = (EditText) v.findViewById(R.id.variable1);
        EditText var2edit = (EditText) v.findViewById(R.id.variable2);
        EditText var3edit = (EditText) v.findViewById(R.id.variable3);

        shape = "Rectangle";
        variable1.setText("Enter the Length (l)");
        variable2.setText("Enter the width  (w)");
        variable3.setVisibility(View.INVISIBLE);
        var3edit.setVisibility(View.INVISIBLE);


        rectanglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape = "Rectangle";
                variable1.setText("Enter the Length (l)");
                variable2.setText("Enter the width  (w)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);

            }
        });

        trianglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape = "Triangle";
                variable1.setText("Enter the base (b)");
                variable2.setText("Enter the height  (h)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
            }
        });

        circlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape = "Circle";
                variable1.setText("Enter the radius (r)");
                variable2.setVisibility(View.INVISIBLE);
                var2edit.setVisibility(View.INVISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
            }
        });
        parallelobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape = "Parallelogram";
                variable1.setText("Enter the base (b)");
                variable2.setText("Enter the height  (h)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);

            }
        });
        trapezoidbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape = "Trapezoid";
                variable1.setText("Enter the first base (b1)");
                variable2.setText("Enter the second base  (b2)");
                variable3.setText("Enter the height (h)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.VISIBLE);
                var3edit.setVisibility(View.VISIBLE);

            }
        });

        solvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (shape){
                    case "Rectangle":
                        calc.rectangleArea(var1edit, var2edit, results);
                        break;
                    case"Triangle":
                        calc.triangleArea(var1edit, var2edit, results);
                        break;
                    case "Circle":
                        calc.circleArea(var1edit, results);
                        break;
                    case "Parallelogram":
                        calc.parallelogramArea(var1edit, var2edit, results);
                        break;
                    case "Trapezoid":
                        calc.trapezoidArea(var1edit, var2edit, var3edit, results);
                }
            }
        });
        return v;
    }
}