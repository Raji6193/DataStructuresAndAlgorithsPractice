package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

public class singleNumber {

    @Test
    public void testSingleNumber() {
        int[] nums = {2, 2, 1};
        System.out.println(findSingleNumber(nums));
    }

    public int findSingleNumber(int[] nums) {

        int result = 0;
        for (int num : nums)
            result ^= num;

        return result;
    }
}
