package DataStructuresAndAlgorithmsPractice.Test;
/*
* Problem solving template

1. Did I understand the problem? yes

2. Test data set
        Minimum  3 data set including positive, negative and edge
        * Input: nums = [1,2,3]
        * Output: [1,2,4]

        * Input: nums = [9]
        * Output: [1,0]

        * Input: nums = [4,3,2,1]
        * Output: [4,3,2,2]

3. Do I know to solve it?
        Yes- great is there an alternate ?

4. Ask for hint (if you don’t know how to solve this5.  Do I know alternate solutions as well

Simple technique brute force

6. If you know the alternate solution find out the O-notations (performance)
7. Then, explain either both are the best (depends on the time)
        Approach 1:- start with the worst-> improve (optimize) ->  End up with the best
        Approach 2: Write down the options and benefits and code the best
8. Start always with the Pseudo code (explain the pseudo code to the interviewer with some test data)
    * Loop through the array from the last element
    * if the last num is less than 1, increment by 1 and return nums
    * Assign ith index of nums to 0
    * Create a new array result with the length one more than the length of nums
    * Assign 0th index of results to 1 and return results
9. Test against different test data
10. If it fails then debug to solve it
11. Optimize the code and remove unnecessary code
*
* TC = O(n)
* SC = O(n)
* */

import org.junit.Test;

import java.util.Arrays;

public class PlusOne {

    @Test
    public void testPlusOne() {
        int[] nums = {8, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    public int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] results = new int[nums.length + 1];
        results[0] = 1;
        return results;
    }
}
