package DataStructuresAndAlgorithmsPractice.Hashing;

public class CountFrequenciesOfNumbers {
    public static void countFrequenciesOfNumbers(int[] nums) {
        int[] freq = new int[10]; // Assuming the numbers are in the range 0-9
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]-0]++;
        }
        System.out.println(java.util.Arrays.toString(freq));
    }
}
