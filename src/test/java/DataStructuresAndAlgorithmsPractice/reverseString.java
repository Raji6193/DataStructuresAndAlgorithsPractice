package DataStructuresAndAlgorithmsPractice;

/*
* Problem solving template

1. Did I understand the problem? yes

2. Test data set
        Minimum  3 data set including positive, negative and edge

        * hello world -> dlrow olleh
        * how are you -> uoy era woh
        * Hi -> iH

3. Do I know to solve it?
        Yes- great is there an alternate ?

4. Ask for hint (if you don’t know how to solve this5.  Do I know alternate solutions as well

Simple technique brute force

6. If you know the alternate solution find out the O-notations (performance)
7. Then, explain either both are the best (depends on the time)
        Approach 1:- start with the worst-> improve (optimize) ->  End up with the best
        Approach 2: Write down the options and benefits and code the best
8. Start always with the Pseudo code (explain the pseudo code to the interviewer with some test data)
    * Initialize a String variable to store the reversed string
    * loop from the last character of the string to the size of the String
    * Append with the resulted string
    * return the string
9. Test against different test data
10. If it fails then debug to solve it
11. Optimize the code and remove unnecessary code
* */

public class reverseString {

    public static String reverseAString (String targetString) {
        String reversedString = "";
        for(int i=targetString.length()-1; i>=0; i--) {
            reversedString += targetString.charAt(i);
        }
        return reversedString;
    }
}
