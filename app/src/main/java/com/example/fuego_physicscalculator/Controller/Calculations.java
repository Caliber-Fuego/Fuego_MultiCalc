package com.example.fuego_physicscalculator.Controller;

import android.widget.EditText;
import android.widget.TextView;

public class Calculations {
    public void rectangleArea(EditText var1edit, EditText var2edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double w = Double.parseDouble(var2edit.getText().toString());
        double answer = l * w;
        results.setText("The Result is " +String.valueOf(answer));
    }
    public void triangleArea(EditText var1edit, EditText var2edit, TextView results){
        double b = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double answer = (b * h)/2;
        results.setText("The Result is " +String.valueOf(answer));
    }
    public void circleArea(EditText var1edit, TextView results){
        double r = Double.parseDouble(var1edit.getText().toString());
        double answer = Math.PI*Math.pow(r,2);
        results.setText("The Result is " +String.valueOf(answer));
    }
    public void parallelogramArea(EditText var1edit, EditText var2edit, TextView results){
        double b = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double answer = b * h;
        results.setText("The Result is " +String.valueOf(answer));
    }
    public void trapezoidArea(EditText var1edit, EditText var2edit, EditText var3edit, TextView results){
        double b1 = Double.parseDouble(var1edit.getText().toString());
        double b2 = Double.parseDouble(var2edit.getText().toString());
        double h  = Double.parseDouble(var3edit.getText().toString());
        double answer = ((b1 + b2)/2)*h;
        results.setText("The Result is " +String.valueOf(answer));
    }
}
