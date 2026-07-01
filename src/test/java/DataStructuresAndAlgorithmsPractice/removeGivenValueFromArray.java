package DataStructuresAndAlgorithmsPractice;

import java.util.Arrays;

public class removeGivenValueFromArray {
    public static int countOfVal(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        int k = nums.length - count;
        return k;
    }

    public static int[] sortedArrayWithoutVal(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = val;
        }
        return nums;
    }
}
