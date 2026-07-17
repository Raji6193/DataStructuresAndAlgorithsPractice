package DataStructuresAndAlgorithmsPractice.Hashing;

public class SubArraySumEqualsToK {
    public static int subArraySum(int[] nums, int k) {
        int sum = nums[0];
        int count = 0;
        
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k || nums[i] == k) {
                count++;
                sum = nums[i];
            }
        }
        return count;
    }
}
