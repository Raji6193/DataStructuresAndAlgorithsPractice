package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayRetainingOneDuplicate {

    @Test
    public void testRemoveDuplicatesFromSortedArray2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
