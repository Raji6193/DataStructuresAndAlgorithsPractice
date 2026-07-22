package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

public class removeGivenValueFromArray {

    @Test
    public void testRemoveGivenValueFromArray() {
        int[] nums = {3, 2, 2, 3, 4, 5, 3, 6, 7, 3};
        int val = 3;
        System.out.println(countOfVal(nums, val));
    }
    public int countOfVal(int[] nums, int val) {
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
