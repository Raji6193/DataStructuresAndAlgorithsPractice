package DataStructuresAndAlgorithmsPractice;

/*
* Problem solving template

1. Did I understand the problem? yes

2. Test data set
        Minimum  3 data set including positive, negative and edge
        * Input: nums = [1,3,4,2,2]
        * Output: 2

        * Input: nums = [3,1,3,4,2]
        * Output: 3

        * Input: nums = [3,3,3,3,3]
        * Output: 3

3. Do I know to solve it?
        Yes- great is there an alternate ?

4. Ask for hint (if you don’t know how to solve this5.  Do I know alternate solutions as well

Simple technique brute force

6. If you know the alternate solution find out the O-notations (performance)
7. Then, explain either both are the best (depends on the time)
        Approach 1:- start with the worst-> improve (optimize) ->  End up with the best
        Approach 2: Write down the options and benefits and code the best
8. Start always with the Pseudo code (explain the pseudo code to the interviewer with some test data)
    * Initialize a integer variable to store the duplicate number from the array
    * Loop through the size of the array
    * Create a inner loop which starts from the i+1 to the size of the array
    * Compare i and j
    * if both are different continue else store in the integer variable and break the loop
    * return the integer variable
9. Test against different test data
10. If it fails then debug to solve it
11. Optimize the code and remove unnecessary code
* */

import org.junit.Test;

public class findDuplicateFromArray {

    @Test
    public void findDuplicates() {
        int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicate(nums));
    }


    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
