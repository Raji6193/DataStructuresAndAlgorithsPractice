package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.Arrays;

public class PermutationInString {
    public static boolean checkPermutationInString(String s1, String s2) {
        boolean isPermutation = false;
        if (s1.length() > s2.length()) {
            isPermutation =  false;
        }

        String s1Ascii = asciiVersion(s1);
        for (int i = 0; i < s2.length()-1; i++) {
            int j = s1.length() + i;
            String substring = asciiVersion(s2.substring(i, j));
            if (substring.equals(s1Ascii))
                isPermutation =  true;
        }
        return isPermutation;
    }
    
    private static String asciiVersion(String str) {
        int[] ascii = new int[26];
        for (int i = 0; i < str.length(); i++) {
            ascii[str.charAt(i) - 'a']++;
        }
        return Arrays.toString(ascii);
    }
}
