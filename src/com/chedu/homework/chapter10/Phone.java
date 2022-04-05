package com.chedu.homework.chapter10;

 class Phone  {
    public void testWork(Computer computer,int n1 ,int n2) {
        int result = computer.work(n1,n2);
       // int result = n1 + n2;
        System.out.println(result);
    }
     /*
计算器接口具有work方法,功能是运算,有一个手机类Cellphone,定义方法testWork
测试计算功能,调用计算接口的work方法,
要求调用CellPhone对像的testWork方法,使用上匿名内部类
     */

}

interface Computer {
    public int work(int a1, int a2);
}
