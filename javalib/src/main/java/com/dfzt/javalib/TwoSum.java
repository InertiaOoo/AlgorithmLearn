package com.dfzt.javalib;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {

        int[] testNums = new int[]{2, 7, 11, 15};

        int testTarget = 18;

        int[] ans = twoSum1(testNums, testTarget);

        if (ans != null) {
            for (int i : ans) {
                System.out.println(i);
            }
        }
    }

    private static int[] twoSum1(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}
