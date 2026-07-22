package DataStructuresAndAlgorithmsPractice.SlidingWindow;

import org.junit.Test;

public class MinSumSubArrayWithTargetWithoutK {

    @Test
    public void testMinSizeSubArraySum() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSumSubArrayWithTargetWithoutK(nums, target));
    }

    public int minSumSubArrayWithTargetWithoutK(int[] nums, int target) {
        int left = 0;
        int right = 0;
        int runningSum = 0;
        int minLength = Integer.MAX_VALUE;
        
        while(right <nums.length) {
            runningSum +=nums[right];
            
            while(runningSum>=target) {
                runningSum -= nums[left];
                minLength = Math.min(minLength, right - left + 1);
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}