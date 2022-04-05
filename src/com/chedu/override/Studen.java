package com.chedu.override;

public class Studen extends Person {
    private int id;
    private double score;

    public Studen(){}

    public Studen(String name,int age,int id,double score){
        super(name,age);
        setId(id);
        setScore(score);
    }

    public String say(){
        return super.say()+"  id  "+id+"  score  "+score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
