package com.chedu.work01.no3;

public class homework10 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("xiaoli",30,'男',"doctor",5000);
        Doctor d2 = new Doctor("xiaolzhang",30,'男',"doctor",5000);
        System.out.println(d1.equals(d2));
    }

}
