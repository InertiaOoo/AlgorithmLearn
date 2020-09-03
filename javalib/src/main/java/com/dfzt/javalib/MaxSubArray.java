package com.dfzt.javalib;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1,-2,2};

        System.out.println(maxSubArray2(nums));

    }


    private static int maxSubArray(int[] nums){
        if(nums.length<1){
            return 0;
        }
        int temp = nums[0];
        int max =nums[0];

        int n = nums.length;

        for(int i=1;i<n;i++){
            if(temp<0&&temp<nums[i]){
                temp = nums[i];
            }else if(temp<0&&nums[i]>0){
                temp=nums[i];
            }else {
                temp+=nums[i];
            }
            if(temp>max){
                max = temp;
            }
        }
        return max;
    }

    /**
       贪心
        */
    public static int maxSubArray2(int[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];

        for(int i = 1; i < n; ++i) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    /**
    动态规划
     */
    public static int maxSubArray3(int[] nums) {
        int n = nums.length, maxSum = nums[0];
        for(int i = 1; i < n; ++i) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }


    /**
     * 分治
     * @param nums
     * @return
     */

    public int maxSubArray4(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public int helper(int[] nums, int left, int right) {
        if (left == right) return nums[left];

        int p = (left + right) / 2;

        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums, p + 1, right);
        int crossSum = crossSum(nums, left, right, p);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    public int crossSum(int[] nums, int left, int right, int p) {
        if (left == right) return nums[left];

        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = p; i > left - 1; --i) {
            currSum += nums[i];
            leftSubsum = Math.max(leftSubsum, currSum);
        }

        int rightSubsum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i = p + 1; i < right + 1; ++i) {
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }

        return leftSubsum + rightSubsum;
    }


}
