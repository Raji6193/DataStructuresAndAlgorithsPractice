package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import java.util.Arrays;

public class MergeTwoArrayAndSortInPlace {
    public static int[] mergeTwoArrayAndSortInPlace(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        int j = 0;
        nums1 = Arrays.copyOf(nums1, k);
        for (int i = m; i < k; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        j = nums1.length - 1;
        for (int i = 0; i >j; i++) {
            if (nums1[i] > nums1[j]) {
                int temp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = temp;
            }
            j--;
        }
        return nums1;
    }
}
