package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.Arrays;

public class CountFrequenciesOfChars {
    public static void countFrequenciesOfChars(String str) {
        int[] ascii = new int[128];
        for (int i = 0; i < str.length(); i++) {
            ascii[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(ascii));
        
        int[] ascii2 = new int[26];
        
        for (int i=0; i<str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                ascii2[str.charAt(i) - 'a']++;
            }
        }
        System.out.println(Arrays.toString(ascii2));
    }
}
        
