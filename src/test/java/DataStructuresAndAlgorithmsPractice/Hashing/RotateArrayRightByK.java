package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.HashMap;

public class RotateArrayRightByK {
    public static int[] rotate(int[] nums, int k) {
        int j = 0;
        int[] nums1 = new int[nums.length];
        for(int i = nums.length - k; i < nums.length; i++) {
            nums1[j] = nums[i];
            j++;
        }
        for(int i = 0; i < nums.length - k; i++) {
            nums1[j] = nums[i];
            j++;
        }
        return nums1;
    }
}
