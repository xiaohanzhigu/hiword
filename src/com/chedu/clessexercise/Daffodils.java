package com.chedu.clessexercise;

public class Daffodils {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int num1 = i / 100;
            int num2 = i %100 /10;
            int num3 = i % 10;
            if (num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3 == i) {
                System.out.println(i);
            }
        }
        daffodils02();
    }
    public static void daffodils02() {
        int n1,n2,n3;
        for(n1 = 1;n1 <= 9;n1++){
            for(n2 = 0;n2 <= 9;n2++) {
                for(n3 = 0;n3 <= 9;n3++) {
                    if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 ==
                            (n1 * 100 + n2 * 10 + n3)) {
                        System.out.println(n1 * 100 + n2 * 10 + n3);
                    }
                }
            }
        }
    }
}
