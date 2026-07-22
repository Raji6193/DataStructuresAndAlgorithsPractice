package DataStructuresAndAlgorithmsPractice.BinarySearch;

import org.junit.Test;

public class SearchInRotatedSortedArray {

    @Test
    public void searchInRotatedSortedArray() {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public boolean search(int[] nums, int target) {
        int low = 1, high = nums.length - 2;
        if (nums[0] == target) return true;
        if (nums[nums.length - 1] == target) return true;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return true;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
}
