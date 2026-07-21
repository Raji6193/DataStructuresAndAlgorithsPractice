package DataStructuresAndAlgorithmsPractice;

import DataStructuresAndAlgorithmsPractice.BinarySearch.FindIndexofElement;
import DataStructuresAndAlgorithmsPractice.BinarySearch.FindSingleElementInASortedArrayWithTwoOccuranceOfEachElement;
import DataStructuresAndAlgorithmsPractice.BinarySearch.FirstAndLastIndexOfElememtInTheSortedArray;
import DataStructuresAndAlgorithmsPractice.BinarySearch.SquareRoot;
import DataStructuresAndAlgorithmsPractice.BitManipulation.BitManipulation;
import DataStructuresAndAlgorithmsPractice.BitManipulation.FindSingleElement;
import DataStructuresAndAlgorithmsPractice.BitManipulation.NumberOf1Bits;
import DataStructuresAndAlgorithmsPractice.Hashing.*;
import DataStructuresAndAlgorithmsPractice.KadanesAlgorithm.MaxSumSubArrayWithNegativeValue;
import DataStructuresAndAlgorithmsPractice.SlidingWindow.*;
import DataStructuresAndAlgorithmsPractice.Test.PlusOne;
import DataStructuresAndAlgorithmsPractice.Test.longestSubstringWithoutRepeatingCharacters;
import DataStructuresAndAlgorithmsPractice.ThreePointer.SortColoursInplace;
import DataStructuresAndAlgorithmsPractice.TrappingWater.TrappingRainWaterBruteForce;
import DataStructuresAndAlgorithmsPractice.TrappingWater.TrappingRainWaterWithPrefixSum;
import DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm.*;
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
        char[] targetCharArray = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseAString(targetCharArray));
        System.out.println(reverseAStringInplace(targetCharArray));
    }

    @Test
    public void findDuplicates() {
        int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicate(nums));
    }

    @Test
    public void reverseInteger() {
        int actualNumber = 321;
        System.out.println(reversedInteger(actualNumber));
    }

    @Test
    public void plusOneTest() {
        int[] digits = {9, 0, 9};
        System.out.println(Arrays.toString(plusOneArray(digits)));
    }

    @Test
    public void testMajorityElement() {
        int[] nums = {8, 8, 7, 7, 7};
        System.out.println(majorityElementFromArray.majorityElement(nums));
    }

    @Test
    public void testRemoveGivenValueFromArray() {
        int[] nums = {3, 2, 2, 3, 4, 5, 3, 6, 7, 3};
        int val = 3;
        System.out.println(removeGivenValueFromArray.countOfVal(nums, val));
    }

    @Test
    public void testPalindrome() {
        int num = 1000000001;
        System.out.println(palindrome.isPalindrome(num));
    }

    @Test
    public void testSingleNumber() {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber.findSingleNumber(nums));
    }

    @Test
    public void testSingleNumberWithBitSet() {
        int[] nums = {2, 2, 1};
        System.out.println(FindSingleElement.findSingleElementWithBitManipulation(nums));
    }

    @Test
    public void testMissingnumber() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumbersFromaDistintRange.missingnumber(nums));
    }

    @Test
    public void testRemoveDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum.sumOfTwoNumber(nums, target)));
    }

    @Test
    public void testTrapRainWater() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(TrappingRainWaterBruteForce.trapRainWater(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    @Test
    public void testTrapRainWaterPrefixSum() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(TrappingRainWaterWithPrefixSum.trapRainWater(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    @Test
    public void testTrapRainWaterTwoPointer() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(TrappingRainWaterWithTwoPointers.trapWithTwoPointers(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    @Test
    public void testTrapRainWaterTwoPointer2() {
        int[] height = {4, 2, 0, 3, 2, 1};
        System.out.println(TrappingRainWaterWithTwoPointers.trapWithTwoPointers(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    @Test
    public void testSlidingWindowMaxSum() {
        int[] nums = {2, 1, 5, 3, 4, 6, 2, 8, 9, 1, 2, 3};
        int k = 3;
        System.out.println(MaxSumSubArrayOfSizeK.maxSumOfSubArray(nums, k));
    }

    @Test
    public void testMinSizeSubArraySum() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(MinSumSubArrayWithTargetWithoutK.minSumSubArrayWithTargetWithoutK(nums, target));
    }

    @Test
    public void testMaxSizeSubStringWhithoutDuplicates() {
        String s = "abba";
        System.out.println(LengthOfLongestSubStringWithoutDuplicates.lengthOfLongestSubStringWithoutDuplicates(s));
    }

    @Test
    public void testMoveZerosToEndArrayInplace() {
        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {1};
        System.out.println(Arrays.toString(MoveZerosToEndOfArrayInplace.moveZerosToEndOfArrayInplace(nums)));
    }

    @Test
    public void testIntersectionOfTwoArrays() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(IntersectionOfTwoArray.intersectionOfTwoArray(nums1, nums2)));
    }

    @Test
    public void testSubArrayProductLessThanK() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(SubarrayProductLessThanK.subArrayProsuctLessThanK(nums, k));
    }

    @Test
    public void testMergeTwoArrayAndSort() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(MergeTwoArrayAndSortInPlace.mergeTwoArrayAndSortInPlace(nums1, m, nums2, n)));
    }

    @Test
    public void testGrumpyBookstoreOwner() {
        int[] customers = {3};
        int[] grumpy = {1};
        int minutes = 1;
        System.out.println(GrumpyBookStoreOwner.maxSatisfied(customers, grumpy, minutes));
    }

    @Test
    public void testSortColours() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(SortColoursInplace.sortColors(nums)));
    }

    @Test
    public void testMaxSumSubArrayKadanes() {
        int[] nums = {2, 3, -8, 7, -1, 2, 3};
        int target = 11;
        System.out.println(MaxSumSubArrayWithNegativeValue.maxSumSubArray(nums, target));
    }

    @Test
    public void testMaxSumSubArrayKadanesWithOutTarget() {
        int[] nums = {7, -9};
        System.out.println(MaxSumSubArrayWithNegativeValue.maxSumSubArrayWithoutTarget(nums));
    }

    @Test
    public void testCountFrequenciesOfChars() {
        String str = "hscfhgfdgdshresgnhf";
        CountFrequenciesOfChars.countFrequenciesOfChars(str);
    }

    @Test
    public void testCountFrequenciesOfNumbers() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        CountFrequenciesOfNumbers.countFrequenciesOfNumbers(nums);
    }

    @Test
    public void testRomanToInteger() {
        String s = "II";
        System.out.println(RomanTointeger.romanToInt(s));
    }

    @Test
    public void testGroupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(GroupAnagrams.groupAnagrams(strs));
    }

    @Test
    public void testGroupAnagramsWithTarget() {
        String s = "af";
        String p = "be";
        System.out.println(GroupAnagrams.anagramsWithTarget(s, p));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArray2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(RemoveDuplicatesFromSortedArrayRetainingOneDuplicate.removeDuplicates(nums));
    }

    @Test
    public void testFruitIntoBaskets() {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(FruitIntoBasket.totalFruit(fruits));
    }

    @Test
    public void testIsomorphicString() {
        String s = "paper", t = "title";
        System.out.println(IsomorphicStrings.isIsomorphicString(s, t));
    }

    @Test
    public void testSubArraySumEqualsK() {
        int[] nums = {1, -1, 0};
        int k = 0;
        System.out.println(SubArraySumEqualsToK.subArraySum(nums, k));
    }

    @Test
    public void testPermutationInString() {
        String s1 = "abb", s2 = "ddc";
        System.out.println(PermutationInString.checkPermutationInString(s1, s2));
    }

    @Test
    public void testRotateArray() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        System.out.println(Arrays.toString(RotateArrayRightByK.rotate(nums, k)));
    }

    @Test
    public void testLongestSubArray() {
        String s = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeatingCharacters.longestSubarray(s));
    }

    @Test
    public void testPlusOne() {
        int[] nums = {8, 9, 9};
        System.out.println(Arrays.toString(PlusOne.plusOne(nums)));
    }

    @Test
    public void testFindFirstAndLastIndexOfElementInSortedArray() {
        int[] nums = {5, 6, 7, 8, 8, 9};
        int target = 8;
        System.out.println(Arrays.toString(FirstAndLastIndexOfElememtInTheSortedArray.findFirstAndLastIndex(nums, target)));
    }

    @Test
    public void testFindSingleElement() {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(FindSingleElementInASortedArrayWithTwoOccuranceOfEachElement.findSingleElement(nums));
    }

    @Test
    public void findBitSet() {
        int n = 5;
        int k =2;
        System.out.println(BitManipulation.findBitSet(n,k));
        System.out.println(BitManipulation.findBitSetRightShift(n,k));
    }

    @Test
    public void squareRoot() {
        int n = 25;
        System.out.println(SquareRoot.squareRoot(n));
    }

    @Test
    public void findElementFromSortedArray() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(FindIndexofElement.findIndexOfElement(nums,target));
    }

    @Test
    public void findNumberOf1Bits(){
        int num = 2147483645;
        System.out.println(NumberOf1Bits.findNumberOf1Bits(num));
    }
}
