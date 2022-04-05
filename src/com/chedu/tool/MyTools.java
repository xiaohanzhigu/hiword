package com.chedu.tool;

public class MyTools {
        public static void printArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
            }
            System.out.println();
        }

        public static void printArray(int[] nums,int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(nums[i]);
            }
            System.out.println();
        }
    }

