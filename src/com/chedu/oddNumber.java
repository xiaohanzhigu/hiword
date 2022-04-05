package com.chedu;

public class oddNumber {
    public static void main(String[] args) {
        //double number = 0, sum = 0;
        int n = 10,sum = 0;
        while (n>0) {
            sum = 0;
            for (int i = 1; i <=n; i++) {
                sum+=i;
            }
            System.out.println(sum);
        n--;
        }


        //System.out.println(sum);
    }
}
