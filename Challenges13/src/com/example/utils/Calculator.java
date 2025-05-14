package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //area of circle
        Circle circle = new Circle(1);
        System.out.printf("By Default Area of Circle is %.2f cm^2 \n",circle.getArea());
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        System.out.printf("Area of Circle is %.2f cm^2\n\n",circle.getArea());

        //area of rectangle
        Rectangle rectangle = new Rectangle(1,1);
        System.out.printf("By Default Area of rectangle is %.2f cm^2 \n",rectangle.getArea());
        System.out.print("Enter the length: ");
        double lenght = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = sc.nextDouble();
        rectangle.setLength(lenght);
        rectangle.setBreadth(breadth);
        System.out.printf("Area of rectangle is %.2f cm^2 \n",rectangle.getArea());
    }
}
