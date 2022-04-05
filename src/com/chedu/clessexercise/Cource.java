package com.chedu.clessexercise;

public class Cource {
    public static void main(String[] args) {
        Cource cource = new Cource();
        cource.c(112101 , "java程序设计",3 );
        System.out.println(cource.printCourceInfo());
    }

    int cNumber;
    String cName;
    double eUnit;

    public void c(int Number, String Name, double Unit) {
        cNumber = Number;
        cName = Name;
        eUnit = Unit;
    }

    public String printCourceInfo(){
        return "编号为: " + cNumber + "  课程名为: " + cName + "  学分数: " + eUnit;
    }
}
