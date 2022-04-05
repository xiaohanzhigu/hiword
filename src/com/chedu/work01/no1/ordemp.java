package com.chedu.work01.no1;

public class ordemp extends employee{

    public ordemp(String name, double daySalary, double days) {
        super(name, daySalary, days);
    }

    public String showSalary(){
        return this.name +"  " + this.daySalary * this.days * 1.0;
    }
}
