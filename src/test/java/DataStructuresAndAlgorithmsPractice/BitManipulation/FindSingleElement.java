package DataStructuresAndAlgorithmsPractice.BitManipulation;

public class FindSingleElement {
    public static int findSingleElementWithBitManipulation(int[] num) {
        int xor = 0;
        for (int i = 0; i < num.length; i++) {
            xor = xor ^ num[i];
        }
        return xor;
    }
}
