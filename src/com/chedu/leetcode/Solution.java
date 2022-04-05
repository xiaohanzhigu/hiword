package com.chedu.leetcode;


import com.chedu.houserent.utility.Utility;

import java.util.Arrays;
import java.util.Locale;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len = Math.min(nums1.length,nums2.length);
        int[] nums = new int[len];

        int i = 0,j = 0,index = 0;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                if (index == 0 || nums1[i] != nums[index - 1]){
                    nums[index++] = nums1[i];
                    //prc = nums1[i];
                }
                i++;
                j++;

            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }

        int[] newNums = new int[index];
        System.arraycopy(nums,0,newNums,0,index);
        return newNums;
    }
}







