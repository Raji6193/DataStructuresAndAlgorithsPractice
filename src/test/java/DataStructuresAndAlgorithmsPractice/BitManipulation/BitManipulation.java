package DataStructuresAndAlgorithmsPractice.BitManipulation;

import org.junit.Test;

public class BitManipulation {
    @Test
    public void findBitSet() {
        int n = 5;
        int k =2;
        System.out.println(findBitSet(n,k));
        System.out.println(findBitSetRightShift(n,k));
    }
    public boolean findBitSet(int num, int k) {

        //Best practicw
        //Formula (n&(1<<k))!=0
        int mask = 1 << k;
        int bitset = num & mask;
        if (bitset != 0)
            return true;
        else return false;
    }

    public boolean findBitSetRightShift(int num, int k) {
        int modifiedValue = num >> k;
        int bitSet = (modifiedValue & 1);
        if (bitSet != 0)
            return true;
        else return false;
    }
}
