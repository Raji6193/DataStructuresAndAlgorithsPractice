package DataStructuresAndAlgorithmsPractice.BitManipulation;

public class BitManipulation {
    public static boolean findBitSet(int num, int k) {

        //Best practicw
        //Formula (n&(1<<k))!=0
        int mask = 1 << k;
        int bitset = num & mask;
        if (bitset != 0)
            return true;
        else return false;
    }

    public static boolean findBitSetRightShift(int num, int k) {
        int modifiedValue = num >> k;
        int bitSet = (modifiedValue & 1);
        if (bitSet != 0)
            return true;
        else return false;
    }
}
