package DataStructuresAndAlgorithmsPractice.BinarySearch;

import org.junit.Test;

public class SearchInserPosition {

    @Test
    public void searchInsertPosition() {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        if (target <= nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        if (target == nums[nums.length - 1]) return nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;

        }
        return low;
    }
}
