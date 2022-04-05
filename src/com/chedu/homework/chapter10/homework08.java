package com.chedu.homework.chapter10;

public class homework08 {
    /*
创建一个Color枚举类
有RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对像;
Color有三个属性redValue,greenValue,blueValue,
创建构造方法,参数包括这三个属性,
每个枚举值都要给这三个属性赋值,三个属性对应的值分别是
red:255,0,0blue:0,0,255 black:0,00 yellow:255,255,0 green::0,255,0
定义接口,里面有方法show,要求Color实现该接口
show方法中显示三属性的值
将枚举对象在switch语句中匹配使用
     */
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            switch(color){
                case RED:
                    System.out.println("匹配到红色");break;
                case BLUE:
                    System.out.println("匹配到蓝色");break;
                case BLACK:
                    System.out.println("匹配到黑色");break;
                case GREEN:
                    System.out.println("匹配到绿色");break;
                case YELLOW:
                    System.out.println("匹配到黄色");break;
            }
        }
    }
}

enum Color implements AA{
    RED(255,0,0), BLUE(0,0,255), YELLOW(255,255,0),
    BLACK(0,0,0), GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;



    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    private Color(){}

    @Override
    public void show() {
        System.out.println(name() + "  " + redValue + "," + greenValue + "," + blueValue);
    }
}
interface AA {
    void show();
}