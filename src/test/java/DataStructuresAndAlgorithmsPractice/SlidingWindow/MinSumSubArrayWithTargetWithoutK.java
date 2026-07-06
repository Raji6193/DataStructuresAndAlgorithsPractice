package DataStructuresAndAlgorithmsPractice.SlidingWindow;

public class MinSumSubArrayWithTargetWithoutK {
    public static int minSumSubArrayWithTargetWithoutK(int[] nums, int target) {
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