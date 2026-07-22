package DataStructuresAndAlgorithmsPractice.ThreePointer;

import org.junit.Test;

import java.util.Arrays;

public class SortColoursInplace {
    @Test
    public void testSortColours() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

    public int[] sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            int temp = 0;
            if (nums[mid] == 0) {
                temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
        return nums;
    }
}
