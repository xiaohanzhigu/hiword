package com.chedu.override;

public class override01 {
    public static void main(String[] args) {
        Person p1 = new Person("李明",20);
        Studen s1 = new Studen("李明", 20, 2103100114, 80);
        System.out.println(p1.say());
        System.out.println(s1.say());
        Person[] p  = new Person[20];
    }
}
