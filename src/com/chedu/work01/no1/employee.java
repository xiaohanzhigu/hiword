package com.chedu.work01.no1;

public class employee {
    String name;
    double daySalary;
    double days;

    public employee(String name, double daySalary, double days) {
        this.name = name;
        this.daySalary = daySalary;
        this.days = days;
    }
    public employee(){}

    public String showSalary(){
        return this.name +"  " + this.daySalary * this.days;
    }
}
