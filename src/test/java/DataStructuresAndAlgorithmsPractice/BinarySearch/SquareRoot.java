package DataStructuresAndAlgorithmsPractice.BinarySearch;

public class SquareRoot {
    public static int squareRoot(int num) {
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
