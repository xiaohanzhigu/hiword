package com.chedu.override.dynamicBinding;

public class dynamic01 {
    public static void main(String[] args) {
        AA b = new BB();
        System.out.println(b.sum2());
    }
}

class AA {
    int count = 10;
    public int sum(){
        return count;
    }
    public int sum1(){
        return count + 10;
    }

    public int sum2(){
        return sum() + 10;
    }
}

class BB extends AA{
    int count = 20;
    public int sum(){
        return count;
    }

    public int sum1(){
        return count + 10;
    }

}
