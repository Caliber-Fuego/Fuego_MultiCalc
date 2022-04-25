package com.example.fuego_physicscalculator.Controller;

import android.widget.EditText;
import android.widget.TextView;

public class Calculations {

    public static String shapeData;
    public static String physicsData;

    //Geter and Setter
    public static String getShapeData() {
        return shapeData;
    }
    public static String getPhysicsData() {
        return physicsData;
    }

    public static void setShapeData(String shapeData) {
        Calculations.shapeData = shapeData;
    }
    public static void setPhysicsData(String physicsData) {
        Calculations.physicsData = physicsData;
    }

    //Free Fall Formulas
    public void freefalldistance(EditText var1, EditText var2, TextView results){
        double g = Double.parseDouble(var1.getText().toString());
        double t = Double.parseDouble(var2.getText().toString());
        double answer = ((0.5)*(g * Math.pow(t, 2)));
        results.setText("The Freefall distance is " +String.valueOf(answer));
    }

    public void freefalltime(EditText var1, EditText var2, TextView results){
        double g = Double.parseDouble(var1.getText().toString());
        double h = Double.parseDouble(var2.getText().toString());
        double denominator = ((0.5)*(g));
        double answer = Math.sqrt(h/denominator);
        results.setText("The time of fall is " +String.valueOf(answer));
    }
    public void freefallvelocity(EditText var1, EditText var2, EditText var3, TextView results){
        double v = Double.parseDouble(var1.getText().toString());
        double g = Double.parseDouble(var2.getText().toString());
        double t = Double.parseDouble(var2.getText().toString());
        double answer = v + (g*t);
        results.setText("The Freefall Velocity is " +String.valueOf(answer));
    }


    //Rectangle
    public void rectangleArea(EditText var1edit, EditText var2edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double w = Double.parseDouble(var2edit.getText().toString());
        double answer = l * w;
        results.setText("The Area of the \nRectangle is " +String.valueOf(answer));
    }
    public void rectangleVolume(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double w = Double.parseDouble(var2edit.getText().toString());
        double h = Double.parseDouble(var3edit.getText().toString());
        double answer = w*h*l;
        results.setText("The Volume of the \nRectangular Pyramid is " +String.valueOf(answer));
    }
    public void rectangleLength(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double w = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double v = Double.parseDouble(var3edit.getText().toString());
        double answer = v/(h*w);
        results.setText("The Length of the \nRectangular Pyramid is " +String.valueOf(answer));
    }
    public void rectangleWidth(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double v = Double.parseDouble(var3edit.getText().toString());
        double answer = v/(h*l);
        results.setText("The Width of the \nRectangular Pyramid is " +String.valueOf(answer));
    }
    public void rectangleHeight(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double w = Double.parseDouble(var2edit.getText().toString());
        double v = Double.parseDouble(var3edit.getText().toString());
        double answer = v/(l*w);
        results.setText("The Height of the \nRectangular Pyramid is " +String.valueOf(answer));
    }

    //Triangle
    public void triangleArea(EditText var1edit, EditText var2edit, TextView results){
        double b = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double answer = (b * h)/2;
        results.setText("The Area of the \nTriangle is " +String.valueOf(answer));
    }
    public void triangleVolume(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double w = Double.parseDouble(var2edit.getText().toString());
        double h = Double.parseDouble(var3edit.getText().toString());
        double answer = (l*w*h)/3;
        results.setText("The Volume of the \nPyramid is " +String.valueOf(answer));
    }
    public void triangleLength(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double w = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double v = Double.parseDouble(var3edit.getText().toString());
        double answer = 3*(v/(h*w));
        results.setText("The Length of the \nPyramid is " +String.valueOf(answer));
    }
    public void triangleWidth(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double v = Double.parseDouble(var3edit.getText().toString());
        double answer = 3*(v/(h*l));
        results.setText("The Width of the \nPyramid is " +String.valueOf(answer));
    }
    public void triangleHeight(EditText var1edit, EditText var2edit,EditText var3edit, TextView results){
        double l = Double.parseDouble(var1edit.getText().toString());
        double w = Double.parseDouble(var2edit.getText().toString());
        double v = Double.parseDouble(var3edit.getText().toString());
        double answer = 3*(v/(l*w));
        results.setText("The Height of the \nPyramid is " +String.valueOf(answer));
    }

//Circle
    public void circleArea(EditText var1edit, TextView results){
        double r = Double.parseDouble(var1edit.getText().toString());
        double answer = Math.PI*Math.pow(r,2);
        results.setText("The Area of the \nCircle is " +String.valueOf(answer));
    }
    public void circleVolume(EditText var1edit, EditText var2edit, TextView results){
        double r = Double.parseDouble(var1edit.getText().toString());
        double h = Double.parseDouble(var2edit.getText().toString());
        double answer = Math.PI*Math.pow(r,2)*h;
        results.setText("The Volume of the \nCylinder is " +String.valueOf(answer));
    }
    public void circleRadius(EditText var1edit, EditText var2edit, TextView results){
        double h = Double.parseDouble(var1edit.getText().toString());
        double v = Double.parseDouble(var2edit.getText().toString());
        double answer = Math.sqrt(v/(Math.PI*h));
        results.setText("The Radius of the \nCylinder is " +String.valueOf(answer));
    }
    public void circleHeight(EditText var1edit, EditText var2edit, TextView results){
        double r = Double.parseDouble(var1edit.getText().toString());
        double v = Double.parseDouble(var2edit.getText().toString());
        double answer = v/(Math.PI*Math.pow(r,2));
        results.setText("The Height of the \nCylinder is " +String.valueOf(answer));
    }}
