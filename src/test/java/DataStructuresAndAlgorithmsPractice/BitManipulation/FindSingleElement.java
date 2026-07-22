package DataStructuresAndAlgorithmsPractice.BitManipulation;

import org.junit.Test;

public class FindSingleElement {

    @Test
    public void testSingleNumberWithBitSet() {
        int[] nums = {2, 2, 1};
        System.out.println(findSingleElementWithBitManipulation(nums));
    }


    public int findSingleElementWithBitManipulation(int[] num) {
        int xor = 0;
        for (int i = 0; i < num.length; i++) {
            xor = xor ^ num[i];
        }
        return xor;
    }
}
