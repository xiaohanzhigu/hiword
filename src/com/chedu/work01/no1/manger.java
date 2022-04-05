package com.chedu.work01.no1;

public class manger extends employee{
    public manger(String name, double daySalary, double days) {
        super(name, daySalary, days);
    }

    public String showSalary(){
        return this.name +"  " + (1000+this.daySalary * this.days * 1.2);
    }
}
