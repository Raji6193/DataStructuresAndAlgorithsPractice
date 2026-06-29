package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

import java.sql.SQLOutput;

import static DataStructuresAndAlgorithmsPractice.findDuplicateFromArray.findDuplicate;
import static DataStructuresAndAlgorithmsPractice.reverseInteger.reversedInteger;
import static DataStructuresAndAlgorithmsPractice.reverseString.reverseAString;
import static DataStructuresAndAlgorithmsPractice.reverseStringInplace.reverseAStringInplace;

public class dsaPractice {

    @Test
    public void test() {
        char[] targetCharArray = {'h','e','l','l','o'};
        System.out.println(reverseAString(targetCharArray));
        System.out.println(reverseAStringInplace(targetCharArray));
    }

    @Test
    public void findDuplicates() {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }

    @Test
    public void reverseInteger() {
        int actualNumber = 321;
        System.out.println(reversedInteger(actualNumber));
    }

}
