package com.chedu.polyparameter;

public class Manage extends Empolyee{
    private double bonus;

    public String manage(){
        return "我在管理";
    }

    public double getAnnual(){
        return super.getAnnual() +  bonus;
    }

    public Manage(String name,double salary,double bonus) {
        super(name,salary);
        this.bonus = bonus;
    }
    public Manage(){

    }
}
