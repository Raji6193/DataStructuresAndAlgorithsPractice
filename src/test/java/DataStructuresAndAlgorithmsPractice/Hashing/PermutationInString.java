package DataStructuresAndAlgorithmsPractice.Hashing;

import org.junit.Test;

import java.util.Arrays;

public class PermutationInString {

    @Test
    public void testPermutationInString() {
        String s1 = "abb", s2 = "ddc";
        System.out.println(checkPermutationInString(s1, s2));
    }
    public boolean checkPermutationInString(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        String s1Ascii = asciiVersion(s1);

        if (s1.length() == s2.length()) {
            String substring = asciiVersion(s2);
            if (substring.equals(s1Ascii))
                return true;
            else
                return false;
        }

        for (int i = 0; i < s2.length() - 1; i++) {
            int j = s1.length() + i;
            String substring = asciiVersion(s2.substring(i, j));
            if (substring.equals(s1Ascii))
                return true;
        }
        return false;
    }

    private static String asciiVersion(String str) {
        int[] ascii = new int[26];
        for (int i = 0; i < str.length(); i++) {
            ascii[str.charAt(i) - 'a']++;
        }
        return Arrays.toString(ascii);
    }
}
