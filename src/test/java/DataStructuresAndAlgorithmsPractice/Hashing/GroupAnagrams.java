package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Initialize hashmap ith String as key and List<String> as value
 * Iterate the array from left to right using a pointer i
 * Create a new array list and add the string at the correct index(key, list.of(str[i])
 * for every string at index i
 *       - add the string to the list defined above -> list.of("eat") -> value part of the map
 *       - compute the sorted version of the string / ascii array to solve that as a key
 *      - check if the sorted version of the string / ascii is present in the map
 *          - if yes, update the entry, just add the current list string to the existing list
 *      - if no, create a new entry in the map, with key as sorted / ascii version of the string and list of strings
 *  - repeat above steps, till the pointer reaches the
 * return the map.values() as a list
 *
 *
 *
 * TC O(n) // ascii approach; O(n)*O(nlogn) // sorted approach
 * SC O(n)
 * */

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String currentStr = strs[i];
            ArrayList<String> valueList = new ArrayList<>();
            valueList.add(currentStr);
            //sorted version
//            String sortedStr = returnSortedVersion(currentStr);

            //ascii version
            String sortedStr = returnAsciiVersionOfString(currentStr); // O(26)-O(1)

            if (map.containsKey(sortedStr)) {
                List<String> strings = map.get(sortedStr);
                strings.addAll(valueList);
                map.put(sortedStr, strings);
            } else {
                map.put(sortedStr, valueList);

            }
        }
        return new ArrayList<>(map.values());
    }

    public static String returnSortedVersion(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static String returnAsciiVersionOfString(String s) {
        int[] ascii = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ascii[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(ascii);
    }

    public static List<Integer> anagramsWithTarget(String s, String p) {
        List<Integer> anagramlist = new ArrayList<>();
        int pAscii = returnAsciiValueOfString(p);
        int left = 0;
        int right = left + p.length();
        while (left <= right && right <= s.length()) {
            String subString = s.substring(left, right);
            int subStringAscii = returnAsciiValueOfString(subString);
           if(subStringAscii == pAscii) 
               anagramlist.add(left);
            left++;
            right++;
        }

        return anagramlist;
    }

    public static int returnAsciiValueOfString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            count = count + a;
        }
        return count;
    }
}
