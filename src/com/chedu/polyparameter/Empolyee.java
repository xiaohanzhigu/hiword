package com.chedu.polyparameter;

public class Empolyee {
    private String name;
    private double salary;

    public Empolyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){
        return salary * 10;
    }

    public Empolyee(){

    }
}
