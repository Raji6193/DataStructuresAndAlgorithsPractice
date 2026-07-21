package DataStructuresAndAlgorithmsPractice.BinarySearch;

public class FindSingleElementInASortedArrayWithTwoOccuranceOfEachElement {
    public static int findSingleElement(int[] nums) {
        int last = nums.length - 1;
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[last] != nums[last - 1]) return nums[last];

        int low = 1, high = last - 1;

        if (nums.length % 2 == 0)
            return -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];

            if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
