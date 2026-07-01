package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

import java.util.Arrays;

import static DataStructuresAndAlgorithmsPractice.findDuplicateFromArray.findDuplicate;
import static DataStructuresAndAlgorithmsPractice.plusOne.plusOneArray;
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
    
    @Test
    public void plusOneTest() {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOneArray(digits)));        
    }
    
    @Test
    public void testMajorityElement() {
        int[] nums = {2,2,1,1,1,2,2, 3,3,3,3,3,3,3,3,3,3,3};
        System.out.println(majorityElementFromArray.majorityElement(nums));
    }
    
    @Test
    public void testRemoveGivenValueFromArray() {
        int[] nums = {3,2,2,3,4,5,3,6,7,3};
        int val = 3;
        System.out.println(removeGivenValueFromArray.countOfVal(nums, val));
        System.out.println(Arrays.toString(removeGivenValueFromArray.sortedArrayWithoutVal(nums, val)));
    }
}
