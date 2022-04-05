package com.chedu.homework.chapter10;

/*
有一个Car类,有属性temperature(温度),车内有Air(空调)类,有吹风的功能flow,
Air会监视车内的温度,如果温度超过40度则吹冷气.如果温度低于0度则吹暖气,如果在这之
间则关掉空调.实例化具有不同温度的Car对像象,调用空调的flow方法,测试空调吹的风是否
正确.使用
 */
public class carair {
    public static void main(String[] args) {
        Car car = new Car(-100);
        car.getAir().flow();
    }
}
class Car {
    private double temperature;
    private  Air air = new Air();

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature > 40) {
                System.out.println("吹冷风");
            } else if (temperature < 0) {
                System.out.println("吹暖风");
            } else {
                System.out.println("关闭");
            }
        }
    }

    public Air getAir(){
        return air;
    }
}
