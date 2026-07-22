package DataStructuresAndAlgorithmsPractice.SlidingWindow;

import org.junit.Test;

/**
 * TC: O(n)
 * SC: O(1)
 * */

public class MaxSumSubArrayOfSizeK {

    @Test
    public void testSlidingWindowMaxSum() {
        int[] nums = {2, 1, 5, 3, 4, 6, 2, 8, 9, 1, 2, 3};
        int k = 3;
        System.out.println(maxSumOfSubArray(nums, k));
    }


    public int maxSumOfSubArray(int[] nums, int k) {
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
