package com.chedu.work01.no4;

public class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age,String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
