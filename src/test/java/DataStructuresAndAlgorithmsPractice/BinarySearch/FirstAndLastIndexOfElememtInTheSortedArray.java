package DataStructuresAndAlgorithmsPractice.BinarySearch;

import com.sun.source.tree.BreakTree;
import org.junit.Test;

import java.util.Arrays;

public class FirstAndLastIndexOfElememtInTheSortedArray {

    @Test
    public void testFindFirstAndLastIndexOfElementInSortedArray() {
        int[] nums = {5, 6, 7, 8, 8, 9};
        int target = 8;
        System.out.println(Arrays.toString(findFirstAndLastIndex(nums, target)));
    }
    public int[] findFirstAndLastIndex(int[] nums, int target) {
        int firstIndex = binarySearch(nums, target, true);
        int secondIndex = binarySearch(nums, target, false);
        return new int[] {firstIndex, secondIndex};
    }

    private int binarySearch(int[] nums, int target, boolean isLeftSearch) {
        int low = 0, high = nums.length, index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid; //found index, but not sure if its first ir last index

                //Whether the other index would be on the left or right side
                // some more logic goes here

                if (isLeftSearch)
                    high = mid - 1;
                else low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return index;
    }
}
