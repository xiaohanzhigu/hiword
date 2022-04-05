package com.chedu.work01.no5;

public class homework13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("小明",20,'男',2103100);
        person[1] = new Student("小李",19,'男',2103101);
        person[2] = new Tencher("张飞",30,'男',10);
        person[3] = new Tencher("貂蝉",35,'女',10);
        Person temp = null;
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j <person.length; j++) {
                if (person[i].getAge() > person[j].getAge()){
                    temp = person[i];
                    person[i] = person[j];
                    person[j] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].printinfo());
        }

        Tools tools = new Tools();
        System.out.println(tools.p(person[0]));
        System.out.println(tools.p(person[3]));

        //System.out.println(person[1].study());
    }
}


class Tools{
    public String  p(Person p){
        if (p instanceof Student){
            Student studen = (Student) p;
            return studen.study()+"\n"+studen.play();
        }else if (p instanceof Tencher){
            Tencher tencher =  (Tencher) p;
            return tencher.teach()+"\n"+tencher.play();
        }else{
            return null;
        }
    }
}

class Tencher extends Person{
    private int work_age;

    public String  play(){
        return this.getName()+"玩篮球";
    }

    public String  teach(){
        return "好好教书";
    }

    public String printinfo(){
        return super.printinfo()+"\n工龄  "+this.work_age+ "\n"+play()+"\n"+teach();
    }

    public Tencher(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

}

class Student extends Person{
    private int stu_id;

    public String play(){
        return this.getName() + "玩足球";
    }

    public String  study(){
        return "我会好好学习";
    }

    public String printinfo(){
        return super.printinfo()+"\n学号  "+this.stu_id+ "\n"+play()+"\n"+study();
    }

    public Student(String name,int age,char sex,int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public Student(){}

    public int getStu_id() {
        return stu_id;
    }
}

class Person{
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }


    public String  play(){
        return getName()+"玩乒乓球";
    }

    public String printinfo(){
        return "姓名  "+this.getName()+"\n年龄  "+this.getAge()+"\n性别  "+this.getSex();
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}


