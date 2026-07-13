package DataStructuresAndAlgorithmsPractice.KadanesAlgorithm;

public class MaxSumSubArrayWithNegativeValue {
    public static int maxSumSubArray(int[] nums, int target) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        currentSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            currentSum += nums[i];
            currentSum = Math.max(currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }        
        return maxSum;
    }
}
