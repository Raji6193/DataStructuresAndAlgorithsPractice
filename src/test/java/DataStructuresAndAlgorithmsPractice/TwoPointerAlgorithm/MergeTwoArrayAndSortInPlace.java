package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * * Psedo Code
 * Create two pointers left and right to point to the last element of the arrays num1 and num2
 * Create a variable k to point to the last element of the nums1 array while the nums1 arrray is resized to m+n
 * while right is greater than or equal to 0
 *      if left is greater than or equal to 0 and nums1[left] is greater than nums2[right]
 *      then assign nums1[k]  to nums1[left] and decrement left\
 *      else assign nums1[k] to nums2[right] and decrement right
 *      decrement k
 * return nums1
 */

public class MergeTwoArrayAndSortInPlace {

    @Test
    public void testMergeTwoArrayAndSort() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(mergeTwoArrayAndSortInPlace(nums1, m, nums2, n)));
    }

    public int[] mergeTwoArrayAndSortInPlace(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int k = m + n - 1;
        nums1 = Arrays.copyOf(nums1, m + n);

        while (right >= 0) {
            if (left >= 0 && nums1[left] > nums2[right]) {
                nums1[k] = nums1[left];
                left--;
            } else {
                nums1[k] = nums2[right];
                right--;
            }

            k--;
        }
        return nums1;
    }
}
