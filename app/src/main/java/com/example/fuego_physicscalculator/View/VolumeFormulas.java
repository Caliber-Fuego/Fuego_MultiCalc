package com.example.fuego_physicscalculator.View;

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

public class VolumeFormulas extends Fragment {

    String solvefor;
    Calculations calc = new Calculations();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_volume_formulas, container, false);
        Button geometrybtn1 = (Button) v.findViewById(R.id.volumebutton);
        Button geometrybtn2 = (Button) v.findViewById(R.id.widthbutton);
        Button geometrybtn3 = (Button) v.findViewById(R.id.heightbutton);
        Button geometrybtn4 = (Button) v.findViewById(R.id.lengthbutton);
        Button solvebtn     = (Button) v.findViewById(R.id.solvebutton);

        TextView varsolve  = (TextView) v.findViewById(R.id.solvedisplay);
        TextView variable1 = (TextView) v.findViewById(R.id.variable1display);
        TextView variable2 = (TextView) v.findViewById(R.id.variable2display);
        TextView variable3 = (TextView) v.findViewById(R.id.variable3display);
        TextView results   = (TextView) v.findViewById(R.id.resultsdisplay);

        EditText var1edit = (EditText) v.findViewById(R.id.variable1);
        EditText var2edit = (EditText) v.findViewById(R.id.variable2);
        EditText var3edit = (EditText) v.findViewById(R.id.variable3);

        switch (calc.getShapeData()){
            case "Rectangle":
            case "Triangle":
                solvefor = "Volume";
                varsolve.setText("Solve for volume (v)");
                variable1.setText("Enter the Length (l)");
                variable2.setText("Enter the width  (w)");
                variable3.setText("Enter the height (h)");
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.VISIBLE);
                var3edit.setVisibility(View.VISIBLE);
                break;
            case "Circle":
                solvefor = "Volume";
                varsolve.setText("Solve for volume (v)");
                variable1.setText("Enter the radius  (r)");
                variable2.setText("Enter the height (h)");
                geometrybtn2.setText("Radius");
                geometrybtn4.setVisibility(View.INVISIBLE);
                variable2.setVisibility(View.VISIBLE);
                var2edit.setVisibility(View.VISIBLE);
                variable3.setVisibility(View.INVISIBLE);
                var3edit.setVisibility(View.INVISIBLE);
                break;
        }

        geometrybtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getShapeData()){
                    case "Rectangle":
                    case "Triangle":
                        solvefor = "Volume";
                        varsolve.setText("Solve for volume (v)");
                        variable1.setText("Enter the Length (l)");
                        variable2.setText("Enter the width  (w)");
                        variable3.setText("Enter the height (h)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.VISIBLE);
                        var3edit.setVisibility(View.VISIBLE);
                    break;
                    case "Circle":
                        solvefor = "Radius";
                        solvefor = "Volume";
                        varsolve.setText("Solve for volume (v)");
                        variable1.setText("Enter the radius  (r)");
                        variable2.setText("Enter the height (h)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.INVISIBLE);
                        var3edit.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
        geometrybtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getShapeData()) {
                    case "Rectangle":
                    case "Triangle":
                        solvefor = "Width";
                        varsolve.setText("Solve for width (w)");
                        variable1.setText("Enter the length (l)");
                        variable2.setText("Enter the height (h)");
                        variable3.setText("Enter the volume (v)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.VISIBLE);
                        var3edit.setVisibility(View.VISIBLE);
                    break;
                    case "Circle":
                        solvefor = "Radius";
                        varsolve.setText("Solve for Radius (r)");
                        variable1.setText("Enter the height  (h)");
                        variable2.setText("Enter the volume (v)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.INVISIBLE);
                        var3edit.setVisibility(View.INVISIBLE);
                        break;
                }

            }
        });
        geometrybtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getShapeData()) {
                    case "Rectangle":
                    case "Triangle":
                        solvefor = "Height";
                        varsolve.setText("Solve for height (h)");
                        variable1.setText("Enter the Length (l)");
                        variable2.setText("Enter the width  (w)");
                        variable3.setText("Enter the volume (v)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.VISIBLE);
                        var3edit.setVisibility(View.VISIBLE);
                    break;
                    case "Circle":
                        solvefor = "Height";
                        varsolve.setText("Solve for height (h)");
                        variable1.setText("Enter the radius  (r)");
                        variable2.setText("Enter the volume (v)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.INVISIBLE);
                        var3edit.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
        geometrybtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getShapeData()) {
                    case "Rectangle":
                    case "Triangle":
                        solvefor = "Length";
                        varsolve.setText("Solve for length (l)");
                        variable1.setText("Enter the width  (w)");
                        variable2.setText("Enter the height (h)");
                        variable3.setText("Enter the volume (v)");
                        variable2.setVisibility(View.VISIBLE);
                        var2edit.setVisibility(View.VISIBLE);
                        variable3.setVisibility(View.VISIBLE);
                        var3edit.setVisibility(View.VISIBLE);
                    break;

                }
            }
        });

        solvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calc.getShapeData()){
                    case "Rectangle":
                        switch (solvefor){
                            case "Volume":
                                calc.rectangleVolume(var1edit, var2edit, var3edit, results);
                                break;
                            case "Length":
                                calc.rectangleLength(var1edit, var2edit, var3edit, results);
                                break;
                            case "Width":
                                calc.rectangleWidth(var1edit, var2edit, var3edit, results);
                                break;
                            case "Height":
                                calc.rectangleHeight(var1edit, var2edit, var3edit, results);
                                break;
                        }
                        break;
                    case"Triangle":
                        switch (solvefor){
                            case "Volume":
                                calc.triangleVolume(var1edit, var2edit, var3edit, results);
                                break;
                            case "Length":
                                calc.triangleLength(var1edit, var2edit, var3edit, results);
                                break;
                            case "Width":
                                calc.triangleWidth(var1edit, var2edit, var3edit, results);
                                break;
                            case "Height":
                                calc.triangleHeight(var1edit, var2edit, var3edit, results);
                                break;
                        }
                        break;
                    case "Circle":
                        switch (solvefor){
                            case "Volume":
                                calc.circleVolume(var1edit, var2edit, results);
                                break;
                            case "Radius":
                                calc.circleRadius(var1edit, var2edit, results);
                                break;
                            case "Height":
                                calc.circleHeight(var1edit, var2edit, results);
                                break;
                        }
                        break;
                }
            }
        });


        return v;

    }
}