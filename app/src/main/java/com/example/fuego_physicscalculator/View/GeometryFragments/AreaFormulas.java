package com.example.fuego_physicscalculator.View.GeometryFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fuego_physicscalculator.Controller.Calculations;
import com.example.fuego_physicscalculator.R;

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
        Button solvebtn     = (Button) v.findViewById(R.id.solvebutton);

        TextView variable1 = (TextView) v.findViewById(R.id.variable1display);
        TextView variable2 = (TextView) v.findViewById(R.id.variable2display);
        TextView variable3 = (TextView) v.findViewById(R.id.variable3display);
        TextView results   = (TextView) v.findViewById(R.id.resultsdisplay);

        EditText var1edit = (EditText) v.findViewById(R.id.variable1);
        EditText var2edit = (EditText) v.findViewById(R.id.variable2);
        EditText var3edit = (EditText) v.findViewById(R.id.variable3);


        switch (calc.getShapeData()){
            case "Rectangle":
                variable1.setText("Enter the Length (l)");
                variable2.setText("Enter the width  (w)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
                break;
            case "Triangle":
                variable1.setText("Enter the base (b)");
                variable2.setText("Enter the height  (h)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
                break;
            case "Circle":
                variable1.setText("Enter the radius (r)");
                variable2.setVisibility(View.INVISIBLE);
                var2edit.setVisibility(View.INVISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
                break;
        }

        solvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getShapeData()){
                    case "Rectangle":
                        calc.rectangleArea(var1edit, var2edit, results);
                        break;
                    case"Triangle":
                        calc.triangleArea(var1edit, var2edit, results);
                        break;
                    case "Circle":
                        calc.circleArea(var1edit, results);
                        break;
                }
            }
        });
        return v;
    }
}