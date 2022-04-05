package com.chedu.work01.no3;

public class Doctor {
    private String name;
    private int age;
    private char gender;
    private String job;
    private double salary;

    public Doctor(String name, int age, char gender, String job, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj instanceof Doctor){
            Doctor doctor = (Doctor)obj;
            if (doctor.getName().equals(this.name)){
                if(doctor.getAge() == this.getAge()){
                    if(doctor.getGender() == this.getGender()){
                        if(doctor.getJob().equals(this.getJob())){
                            if(doctor.getSalary() == this.getSalary()){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
