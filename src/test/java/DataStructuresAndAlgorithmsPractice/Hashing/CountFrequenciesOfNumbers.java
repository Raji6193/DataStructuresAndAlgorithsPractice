package DataStructuresAndAlgorithmsPractice.Hashing;

import org.junit.Test;

public class CountFrequenciesOfNumbers {

    @Test
    public void testCountFrequenciesOfNumbers() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        countFrequenciesOfNumbers(nums);
    }

    public void countFrequenciesOfNumbers(int[] nums) {
        int[] freq = new int[10]; // Assuming the numbers are in the range 0-9
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]-0]++;
        }
        System.out.println(java.util.Arrays.toString(freq));
    }
}
