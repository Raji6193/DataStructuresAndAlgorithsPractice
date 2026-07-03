package DataStructuresAndAlgorithmsPractice;

import java.util.Arrays;

public class missingNumbersFromaDistintRange {
    public static int missingnumber(int[] nums) {
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
