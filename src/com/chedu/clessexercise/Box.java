package com.chedu.clessexercise;

public class Box {
    public static void main(String[] args) {
        Box box = new Box(10, 10, 10);
        System.out.println(box.volume());
        System.out.println(box.area());
    }

    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int area() {
        return (length * width + length * height + width * height) * 2;
    }

    public int volume(){
        return length * width * height;
    }
}
