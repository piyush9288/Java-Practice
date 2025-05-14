package com.example.geometry;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getArea() {
        area = length * breadth;
        return area;
    }
}
