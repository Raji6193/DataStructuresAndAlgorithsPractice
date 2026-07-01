package DataStructuresAndAlgorithmsPractice;

public class reverseStringInplace {

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
