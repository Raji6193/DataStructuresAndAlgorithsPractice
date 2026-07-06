package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

public class IntersectionOfTwoArray {
    public static int[] intersectionOfTwoArray(int[] nums1, int[] nums2) {
        int newArrraySize = Math.min(nums1.length, nums2.length);
        int[] intersectionArray = new int[newArrraySize];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersectionArray[count] = nums1[i];
                    count++;
                    break;
                }
            }
        }
        return intersectionArray;
    }
}
