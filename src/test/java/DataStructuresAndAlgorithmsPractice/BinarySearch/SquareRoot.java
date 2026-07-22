package DataStructuresAndAlgorithmsPractice.BinarySearch;

import org.junit.Test;

public class SquareRoot {

    @Test
    public void squareRoot() {
        int n = 25;
        System.out.println(squareRoot(n));
    }
    public int squareRoot(int num) {
        int low = 1, high = num / 2;
        if (num < 2)
            return num;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == num / mid)
                return mid;
            else if (mid < num / mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
}
