package com.chedu.work01.no4;

public class personwork {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("xiaoaming",19,"studen");
        p[1] = new Person("xiaoli",20,"studen");
        p[2] = new Person("xiaoliang",22,"studen");
        Person  t = p[0];
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 1;j < p.length;j++){
                System.out.println(i + " " + j);
                if (p[i].age < p[j].age){
                    t = p[i];
                    p[i] = p[j];
                    p[j] = t;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
