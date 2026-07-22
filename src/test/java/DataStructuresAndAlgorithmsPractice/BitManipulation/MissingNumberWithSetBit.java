package DataStructuresAndAlgorithmsPractice.BitManipulation;

import org.junit.Test;

public class MissingNumberWithSetBit {

    @Test
    public void testMissingnumberBitManipulation() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for(int i=0;i<nums.length;i++){
            xor = xor^i;
            xor = xor^nums[i];
        }
        return xor;
    }
}
