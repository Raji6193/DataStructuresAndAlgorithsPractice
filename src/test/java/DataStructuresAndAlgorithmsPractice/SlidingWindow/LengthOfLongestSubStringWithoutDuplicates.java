package DataStructuresAndAlgorithmsPractice.SlidingWindow;

public class LengthOfLongestSubStringWithoutDuplicates {
    public static int lengthOfLongestSubStringWithoutDuplicates(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            // Check if s[right] already exists in the current window
            int i = left;
            while (i < right) {
                if (s.charAt(i) == s.charAt(right)) {
                    left = i + 1;
                    break;
                }
                i++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
