package DataStructuresAndAlgorithmsPractice.TwoPointerAlgorithm;

import org.junit.Test;

public class TrappingRainWaterWithTwoPointers {

    @Test
    public void testTrapRainWaterTwoPointer2() {
        int[] height = {4, 2, 0, 3, 2, 1};
        System.out.println(trapWithTwoPointers(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    @Test
    public void testTrapRainWaterTwoPointer() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapWithTwoPointers(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    public int trapWithTwoPointers(int[] height) {
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
