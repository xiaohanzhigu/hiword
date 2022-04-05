package com.chedu.homework.chapter10;

public abstract class Animal {
    public abstract void shout();

}

 class Cat extends Animal {

     @Override
     public void shout() {
         System.out.println("小猫");
     }
 }

 class Dog extends Animal {

     @Override
     public void shout() {
         System.out.println("小狗");
     }
 }

