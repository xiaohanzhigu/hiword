package com.chedu.clessexercise;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area(10));
        System.out.println(circle .circumference(10));
    }

    public double circumference(double radius) {
        return 2 * radius * Math.PI;
    }

    public double area(double radius) {
        return radius * radius * Math.PI;
    }
}
