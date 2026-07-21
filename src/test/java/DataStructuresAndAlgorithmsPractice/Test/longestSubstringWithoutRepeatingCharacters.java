package DataStructuresAndAlgorithmsPractice.Test;
/*
* Problem solving template

1. Did I understand the problem? yes

2. Test data set
        Minimum  3 data set including positive, negative and edge
        * Input: s = "abcabcbb'
        * Output: 3

        * Input: s = "bbbbb"
        * Output: 1

        * Input: s = "pwwkew"
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
    * Initialize 3 variables left, right and maxlength and assign  to 0;
    * Loop untill right is less than the length of the String s
    * initialize a variable i and assign to left;
    * loop untill i is less than right
    * Check for the condition whether th character at ith index and right index are equal.
    *       if yes increment left to i + 1 and then break
    *       increment i with 1
    * Get the Max of maxlength and (right -left +1)
    * increment right with 1;
    * And return maxLength
9. Test against different test data
10. If it fails then debug to solve it
11. Optimize the code and remove unnecessary code
*
* TC O(m+n)
* SC O(n)
*
* */

public class longestSubstringWithoutRepeatingCharacters {
    public static int longestSubarray(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            int i = left;
            while (i < right) {
                if (s.charAt(i) == s.charAt(right)) {
                       left = i+1;
                       break;
                }
                i++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
