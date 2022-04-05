package com.chedu.clessexercise;

import java.util.Scanner;

public class inputInt {
    public static void main(String[] args) {

        int number;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                break;
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println(number);
    }
}
