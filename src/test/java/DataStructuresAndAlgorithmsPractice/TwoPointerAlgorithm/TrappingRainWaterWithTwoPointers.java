package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

public class TrappingRainWaterWithTwoPointers {
    public static int trapWithTwoPointers(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMaxHeight = 0;
        int rightMaxHeight = 0;
        int save = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                //Process left max height
                if (leftMaxHeight < height[left]) {
                    leftMaxHeight = height[left];
                } else {
                    save += leftMaxHeight - height[left];
                }
                left++;
            } else {
                //Process right max height
                if (rightMaxHeight < height[right]) {
                    rightMaxHeight = height[right];
                } else {
                    save += rightMaxHeight - height[right];
                }
                right--;
            }
        }
        return save;
    }
}
