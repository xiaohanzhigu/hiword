package com.chedu.homework.chapter10.homework06;

public class home06 {
    /*有一个交通工具接口类Vehicles,有work接口
    有Horse类和Boat类分别实现Vehicles
    创建交通工具工厂类,有两个方法分别获得交通工具Horse和Boat
    有Person类,有name和Vehicles)属性,在构造器中为两个属性赋值
    实例化Person对像“唐僧”,要求一般情况下用Horse作为交通工具,
    遇到大河时用Boat作为交通工具
     */

    //Person p = new Person("唐" , new Horse);

    public static void main(String[] args) {
        Person tang = new Person("tang", new Horse());
        tang.passRiver();
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.common();
        tang.blower();
    }

}

class Person {
    private String name;
    private Vehicles vehicele;

    public Person(String name, Vehicles vehicele) {
        this.name = name;
        this.vehicele = vehicele;
    }

    //当不是船的时候改为船
    //提高扩展性
    public void passRiver() {
        if (!(vehicele instanceof Boat)) {
            vehicele = VehiclesFactory.getBoat();
        }
        vehicele.work();
    }

    public void blower() {
        if (!(vehicele instanceof Fan)) {
            vehicele = VehiclesFactory.getFan();
        }
        vehicele.work();
    }

    public void common() {
        if (!(vehicele instanceof Horse)) {
            vehicele = VehiclesFactory.getHorse();
        }
        vehicele.work();
    }


}

class  VehiclesFactory {
    //一直传一条马
    private static Horse horse = new Horse();
    private VehiclesFactory(){};

    public static Boat getBoat() {
        return new Boat();
    }

    public static Horse getHorse() {
        return horse;
    }

    public static  Fan getFan() {
        return new Fan();
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河");
    }
}

class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("走路");
    }
}

 class Fan implements Vehicles {

     @Override
     public void work() {
         System.out.println("扇风");
     }
 }
