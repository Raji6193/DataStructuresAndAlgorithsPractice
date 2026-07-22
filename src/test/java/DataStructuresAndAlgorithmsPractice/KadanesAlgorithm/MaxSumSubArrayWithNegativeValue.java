package DataStructuresAndAlgorithmsPractice.KadanesAlgorithm;

import org.junit.Test;

public class MaxSumSubArrayWithNegativeValue {

    @Test
    public void testMaxSumSubArrayKadanesWithOutTarget() {
        int[] nums = {7, -9};
        System.out.println(maxSumSubArrayWithoutTarget(nums));
    }

    @Test
    public void testMaxSumSubArrayKadanes() {
        int[] nums = {2, 3, -8, 7, -1, 2, 3};
        int target = 11;
        System.out.println(maxSumSubArray(nums, target));
    }

    public int maxSumSubArray(int[] nums, int target) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        if(nums.length == 1)
            return nums[0];
//        currentSum = nums[0];
        for(int i=0; i<nums.length; i++) {
            currentSum += nums[i];
            currentSum = Math.max(currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }        
        return maxSum;
    }

    public int maxSumSubArrayWithoutTarget(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        if(nums.length == 1)
            return nums[0];

        for(int i=0; i<nums.length; i++) {
            currentSum += nums[i];
            currentSum = Math.max(currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}