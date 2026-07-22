package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * Psedo Code
 * Sort both the arrays
 * Create a new array result with the minimum length of both the arrays
 * Initialize a variable index to 0
 * create two pointers i and j to 0
 * While i is less than the length of the nums1 array and j is less than the length of the nums2 array
 * Check for the condition if nums[i ==nums[j] 
 *          then check whether the index is 0 or the last element of the result array is equal to the last element of the nums1 array, 
 *          if yes then add the element to the result array and increment the index
 *          if not increment both the pointers i and j
 * if nums1[i] is less than nums2[j] then increment i
 * if nums1[i] is greater than nums2[j] then incremant j
 * return the result array with the length of the index 
 */

public class IntersectionOfTwoArray {

    @Test
    public void testIntersectionOfTwoArrays() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersectionOfTwoArray(nums1, nums2)));
    }


    public int[] intersectionOfTwoArray(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (index == 0 || result[index - 1] != nums1[i]) {
                    result[index++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
