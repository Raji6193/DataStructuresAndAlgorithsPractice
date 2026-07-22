package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

public class reverseStringInplace {

    @Test
    public void test() {
        char[] targetCharArray = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseAStringInplace(targetCharArray));
    }

    public static char[] reverseAStringInplace(char[] s) {
        int left = s.length - 1;
        int right = 0;

        for (int i = s.length; i > 0; i--) {
            if (left > right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

                left--;
                right++;
            }
        }
        return s;
    }
}
