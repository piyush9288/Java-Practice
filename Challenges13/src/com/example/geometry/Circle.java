package com.example.geometry;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
}