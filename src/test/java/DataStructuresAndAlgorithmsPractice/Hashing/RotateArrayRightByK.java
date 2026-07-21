package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.HashMap;

public class RotateArrayRightByK {
    public static int[] rotate(int[] nums, int k) {

        k = k % nums.length - 1;

        reverse(0, nums.length-1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length-1, nums);

        return nums;
    }

    private static int[] reverse(int left, int right, int[] nums) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
}
