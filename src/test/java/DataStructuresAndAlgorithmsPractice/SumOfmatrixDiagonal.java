package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

public class SumOfmatrixDiagonal {

    @Test
    public void matrixSum() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumOfMatricDiagonal(matrix));
    }

    public int sumOfMatricDiagonal(int[][] nums) {
        int sum = 0;
        int j = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (j == i)
                sum = sum + nums[i][i];
            else
                sum = sum + nums[i][i] + nums[i][j];
            j--;
        }
        return sum;
    }
}

