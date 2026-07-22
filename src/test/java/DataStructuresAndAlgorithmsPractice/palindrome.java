package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

public class palindrome {

    @Test
    public void testPalindrome() {
        int num = 1000000001;
        System.out.println(isPalindrome(num));
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }

        if (original == reversed)
            return true;
        else
            return false;
    }
}