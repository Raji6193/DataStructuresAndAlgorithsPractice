package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

import java.util.Arrays;

public class missingNumbersFromaDistintRange {

    @Test
    public void testMissingnumber() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingnumber(nums));
    }


    public int missingnumber(int[] nums) {
        int count = 0;
        int[] newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            newNums[i] = count;
            count++;
        }

        Arrays.sort(nums);

        for (int i = 0; i < newNums.length; i++) {
            int j = i;
            try {
                if (newNums[i] != nums[j])
                    return newNums[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                return newNums[i];
            }

        }
        return -1;
    }
}
