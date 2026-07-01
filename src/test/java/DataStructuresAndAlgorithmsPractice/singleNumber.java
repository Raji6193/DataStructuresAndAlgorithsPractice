package DataStructuresAndAlgorithmsPractice;

public class singleNumber {

    public static int findSingleNumber(int[] nums) {

        int result = 0;
        for (int num : nums)
            result ^= num;

        return result;
    }
}
