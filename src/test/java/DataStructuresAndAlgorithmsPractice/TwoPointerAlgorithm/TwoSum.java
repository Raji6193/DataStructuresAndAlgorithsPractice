package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class TwoSum {

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sumOfTwoNumber(nums, target)));
    }


    public int[] sumOfTwoNumber(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
