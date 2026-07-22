package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class MoveZerosToEndOfArrayInplace {

    @Test
    public void testMoveZerosToEndArrayInplace() {
        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {1};
        System.out.println(Arrays.toString(moveZerosToEndOfArrayInplace(nums)));
    }

    public int[] moveZerosToEndOfArrayInplace(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
