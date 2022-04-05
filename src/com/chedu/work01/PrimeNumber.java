package com.chedu.work01;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 30;
        for (int number = 2; number <= n; number++) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
            }
        }
        ThirtiethPrimeNumber();
    }
    public static void ThirtiethPrimeNumber() {
        int count = 0;
        int n = 30;
        int primeNumber = 0;

        for (int number = 2; count <= n; number++) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
                //System.out.println(number);
                if (count == 30) {
                    System.out.println(number);
                }
            }
        }
    }
}
