package com.dfzt.javalib;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {

    }



    public static void merge1(int[] nums1, int m, int[] nums2, int n) {//合并后排序
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);

}


    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1,j=n-1;

        int target = m+n-1;

        while (i>=0&&j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[target--] = nums1[i--];

            }else {
                nums1[target--] = nums2[j--];
            }

        }

        System.arraycopy(nums2, 0, nums1, 0, j + 1);

    }

}
