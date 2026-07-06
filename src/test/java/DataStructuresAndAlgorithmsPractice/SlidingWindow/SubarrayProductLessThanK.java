package DataStructuresAndAlgorithmsPractice.SlidingWindow;

public class SubarrayProductLessThanK {
    public static int subArrayProsuctLessThanK(int[] nums, int k) {
        int count = 0;
        int multiply = 1;
        int t = nums.length - 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (k < nums[i])
//                count++;
//        }
        int i = 0;
        int temp = t;
        while (t > 0) {
            while (temp <= nums.length) {
                while (i < t) {
                    multiply = multiply * nums[i];
                    i++;
                }
                if (k < multiply)
                    count++;
                i=0;
                multiply = 1;
                temp++;
            }
            t--;
        }
        return count;
    }
}
