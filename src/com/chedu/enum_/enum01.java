package com.chedu.enum_;

public class enum01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRINT);
    }
}
enum Season{
    SPRINT("春天"),SUMMER("夏天"),AUTUMN("秋天"),WEATHER("冬天"),
    WHAT  //调用无参构造器
    ;

    private String name;

    private Season(){}

    private Season(String name) {
        this.name = name;
    }

}

