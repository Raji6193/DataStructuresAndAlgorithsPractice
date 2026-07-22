package DataStructuresAndAlgorithmsPractice.BitManipulation;

import org.junit.Test;

public class AddBinaryString {
    @Test
    public void addBinary() {
        String s1 = "11";
        String s2 = "1";
        System.out.println(addBinaryString(s1, s2));
    }

    public String addBinaryString(String s1, String s2) {
        int indexA = s1.length() - 1;
        int indexB = s2.length() - 1;
        int carry = 0;
        StringBuilder s = new StringBuilder();
        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            int digitA = indexA >= 0 ? s1.charAt(indexA) - '0' : 0;
            int digitB = indexB >= 0 ? s2.charAt(indexB) - '0' : 0;
            int sum = digitA + digitB + carry;
            int rem = sum % 2;
            carry = sum / 2;
            s.append(String.valueOf(rem));
            indexA--;
            indexB--;
        }
        return s.reverse().toString();

    }
}
