package com.chedu.clessexercise;

public class Rect {
    public static void main(String[] args) {
        Rect rect = new Rect(10,10);
        System.out.println(rect.area());
        Rect rect1 = new Rect();
        System.out.println(rect1.area());
    }

    double a;
    double b;


    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rect(){}

    public double area() {
        return a * b;
    }
}
