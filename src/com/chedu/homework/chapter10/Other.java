package com.chedu.homework.chapter10;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Other {
    /*
    编一个类A,在类中定义局部内部类B,B中有一个私有final常量name,有一个方法
    show打印常量name.进行测试
    进阶:A中也定义一个私有的变量name,在show方法中打印测试
     */
    public static void main(String[] args) {
        A a = new A();
        a.other1();
    }

}
class A {
    private String name = "小明";

    public void other1() {
        class B {
            private final String name = "小李";

            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

}
