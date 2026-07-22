package DataStructuresAndAlgorithmsPractice.BinarySearch;

import org.junit.Test;

public class Search2DArray {

    @Test
    public void search2dArray() {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;
        System.out.println(search2DArray(matrix,target));
    }
    public  boolean search2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int low = 0, high = matrix[i].length-1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if(matrix[i][mid] == target)
                    return true;
                if(matrix[i][mid]<target)
                    low= mid+1;
                else high = mid-1;
            }
        }
        return false;
    }
}
