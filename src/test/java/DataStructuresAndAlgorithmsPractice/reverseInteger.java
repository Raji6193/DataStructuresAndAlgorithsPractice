package DataStructuresAndAlgorithmsPractice;

/*
* Problem solving template

1. Did I understand the problem? yes

2. Test data set
        Minimum  3 data set including positive, negative and edge
        * Input:  x = 123
        * Output: 321

        * Input: x = -123
        * Output: -321

        * Input: 120
        * Output: 21

3. Do I know to solve it?
        Yes- great is there an alternate ?

4. Ask for hint (if you don’t know how to solve this5.  Do I know alternate solutions as well

Simple technique brute force

6. If you know the alternate solution find out the O-notations (performance)
7. Then, explain either both are the best (depends on the time)
        Approach 1:- start with the worst-> improve (optimize) ->  End up with the best
        Approach 2: Write down the options and benefits and code the best
8. Start always with the Pseudo code (explain the pseudo code to the interviewer with some test data)
    * Initialize a integer variable to store the reversed number
    * Loop until the given number is greater than zero
    * Divide the number by 10 and store the modulus in the integer variable
    * return the integer variable
9. Test against different test data
10. If it fails then debug to solve it
11. Optimize the code and remove unnecessary code
* */

import org.junit.Test;

public class reverseInteger {

    @Test
    public void reverseInteger() {
        int actualNumber = 321;
        System.out.println(reversedInteger(actualNumber));
    }

    public int reversedInteger(int actualInteger) {
        int reversedNumber = 0;

        while (actualInteger != 0) {
            int digit = actualInteger % 10;
            actualInteger /= 10;

            if ((reversedNumber > Integer.MAX_VALUE / 10) || (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if ((reversedNumber < Integer.MIN_VALUE / 10) || (reversedNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversedNumber = reversedNumber * 10 + digit;
        }
        return reversedNumber;
    }
}
