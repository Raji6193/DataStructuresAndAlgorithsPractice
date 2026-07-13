package DataStructuresAndAlgorithmsPractice.Hashing;

import java.util.HashMap;

public class RomanTointeger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int romanInteger = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                int temp = map.get(s.charAt(i)) - map.get(s.charAt(i - 1));
                romanInteger = romanInteger + temp - map.get(s.charAt(i - 1));
            }
            else {
                romanInteger += map.get(s.charAt(i));
            }
        }
        return romanInteger;
    }
}
