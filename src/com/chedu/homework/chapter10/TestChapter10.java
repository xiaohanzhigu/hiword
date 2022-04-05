package com.chedu.homework.chapter10;
import com.chedu.homework.chapter10.*;

public class TestChapter10 {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.testWork(new Computer() {
            @Override
            public int work(int n1 , int n2) {
                return n1 - n2;
            }

        },1,2);
    }
}
