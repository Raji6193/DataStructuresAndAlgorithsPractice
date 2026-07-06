package DataStructuresAndAlgorithmsPractice.SlidingWindow;

/**
 * TC: O(n)
 * SC: O(1)
 * */

public class MaxSumSubArrayOfSizeK {
    public static int maxSumOfSubArray(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        //1 iteration till window size and calculate the sum of first window
        for (int i = 0; i < k; i++) { //O(k
                windowSum += nums[i];
        }
        maxSum= Math.max(maxSum, windowSum);
        //iterate from k to end of array and calculate the sum of next window by adding the next element and removing the first element of previous window
        for(int i=k; i<nums.length; i++){ //O(n)
            windowSum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
