package DataStructuresAndAlgorithmsPractice;

public class majorityElementFromArray {

    public static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int majorityElement = -1;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n) {
                return nums[i];
            }
        }
        return -1;
    }
}
