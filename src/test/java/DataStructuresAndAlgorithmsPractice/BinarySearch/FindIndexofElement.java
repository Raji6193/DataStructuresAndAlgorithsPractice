package DataStructuresAndAlgorithmsPractice.BinarySearch;

import org.junit.Test;

public class FindIndexofElement {
    @Test
    public void findElementFromSortedArray() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(findIndexOfElement(nums,target));
    }
    public int findIndexOfElement(int[] nums, int target) {

        int low = 0, high = nums.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]<target)
                low = mid+1;
            else high = mid -1;
        }
        return -1;
    }
}
