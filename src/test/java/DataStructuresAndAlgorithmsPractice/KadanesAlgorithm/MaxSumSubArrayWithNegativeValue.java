package DataStructuresAndAlgorithmsPractice.KadanesAlgorithm;

public class MaxSumSubArrayWithNegativeValue {
    public static int maxSumSubArray(int[] nums, int target) {
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

    public static int maxSumSubArrayWithoutTarget(int[] nums) {
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
