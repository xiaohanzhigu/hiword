package com.chedu.polyparameter;

public class Worker extends Empolyee{
    public Worker(){

    }

    public Worker(String name,double salary){
        super(name,salary);
    }

    public String Work(){
        return "我在工作";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
