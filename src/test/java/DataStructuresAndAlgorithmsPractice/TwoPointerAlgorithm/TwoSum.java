package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

public class TwoSum {
    public static int[] sumOfTwoNumber(int[] nums, int target) {
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
