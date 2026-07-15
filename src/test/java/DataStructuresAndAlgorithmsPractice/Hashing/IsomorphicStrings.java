package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.HashMap;
import java.util.Map;

/*
* Pseudo code
* Initialize two maps map and map2
* Check whether the length of s and t are not equal, if yes return false
* crate a for loop to loop through the s string characters
* Create 2 characters to store the ith index character of th strings s and t respectively
* Check for the condition if the map contains key of the char at ith index of string s,
*       if yes, check if the value of the key of map with ith index of the string s not equals ith index of th string t, if yes return false
* else add th key ith index of string s and value as ith index of String t to the map.
*
* Similarly check for the t string and update the map
* Check for the condition if the map2 contains key of the char at ith index of string t,
 *       if yes, check if the value of the key of map2 with ith index of the string t not equals ith index of th string s, if yes return false
 * else add th key ith index of string t and value as ith index of String s to the map2.
 *
 *
 * Pseudo Code cleaner version

1. Initialize two HashMaps:
   - map to store the mapping from characters in s to characters in t.
   - map2 to store the mapping from characters in t to characters in s.

2. If the lengths of s and t are not equal, return false.

3. Iterate through both strings using a for loop.

4. For each index i:
   - Store the current characters:
     - ch1 = s.charAt(i)
     - ch2 = t.charAt(i)

5. Check the mapping from s to t:
   - If map contains ch1:
       - If map.get(ch1) is not equal to ch2, return false.
   - Otherwise, add the mapping (ch1, ch2) to map.

6. Check the mapping from t to s:
   - If map2 contains ch2:
       - If map2.get(ch2) is not equal to ch1, return false.
   - Otherwise, add the mapping (ch2, ch1) to map2.

7. If the loop completes without any mismatch, return true.
* */

public class IsomorphicStrings {
    public static boolean isIsomorphicString(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2)
                    return false;
            } else
                map.put(ch1, ch2);

            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch1)
                    return false;
            } else
                map2.put(ch2, ch1);
        }
        return true;
    }
}
