package com.chedu.homework.chapter10;

public class Frock {
    /*
1.在Frock类中声明私有的静态属性currentNum[int类型,初始值为100000,作为衣服出厂的序列号起始值.
2.声明公有的静态方法getNextNum,作为生成上衣唯一序列号的方法.每调用一次,将
currentNumi增加100,并作为返回值.
3.在TestFrock类的main方法中,分两次调用getNextNum方法,获取序列号并打印输出.
4.在Frock类中声明serialNumber(序列号)属性,并提供对应的get方法;
5.
在Frock类的构造器中,通过调用getNextNum方法为Frock对象获取唯一序列号,赋给
serialNumberl属性.
6.
在TestFrock类的main方法中,分别创建三个Frock对像,并打印三个对象的序列号,验
证是否为按100递增.
     */
    public static void main(String[] args) {
        int f1 = frock1.getNextNum();
        int f2 = frock1.getNextNum();
        System.out.println(f1 + "   " + f2);
        frock1 f3 = new frock1();
        frock1 f4 = new frock1();
        System.out.println(f3);
        System.out.println(f4);
    }
}

class frock1 {
    private static int currentNum = 100000;

    private int serialNumber;

    public frock1() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    @Override
    public String toString() {
        return "frock1{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}
