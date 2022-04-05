package com.chedu.clessexercise;

public class BuyFlower {
    public static void main(String[] args) {
        for (int fine = 0; fine <=8; fine++) {
            int fineFlower = fine * 20;
            int rain = (8 - fine);
            int rainFlower = (8 - fine) * 12;
            if (fineFlower + rainFlower == 112) {
                System.out.println("晴天:" + fine + "雨天:" + rain );
            }
        }
    }
}
