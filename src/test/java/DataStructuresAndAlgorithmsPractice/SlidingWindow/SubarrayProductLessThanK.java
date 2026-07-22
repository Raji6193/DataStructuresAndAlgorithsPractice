package DataStructuresAndAlgorithmsPractice.SlidingWindow;

import org.junit.Test;

public class SubarrayProductLessThanK {

    @Test
    public void testSubArrayProductLessThanK() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(subArrayProsuctLessThanK(nums, k));
    }

    public int subArrayProsuctLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}