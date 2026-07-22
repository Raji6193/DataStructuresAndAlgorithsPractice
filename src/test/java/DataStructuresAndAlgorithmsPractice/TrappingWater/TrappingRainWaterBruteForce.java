package DataStructuresAndAlgorithmsPractice.TrappingWater;

import org.junit.Test;

/**
 * initialise two variables called leftMaxHeight=Integer.MIN_VALUE, rightMaxHeight=Integer.MIN_VALUE, save=0
 * iterate the array from start index till the end
 * - for every index i, compute the leftMaxHeight, rightMaxHeight
 * - Take a minimum between the left and right max heights (i.e water can be stored till the wall that has the min height)
 * - to compute the units of water stored subtract the building height (value at current index) from the minHeight
 * - if the ans is less than zero, do a math.max() with 0, since the water can't be saved in -ve units
 * - accumulate the result into save variable and proceed
 * return save
 *
 * TC: O(n^2)
 * SC: O(1)
 *
 *
 *
 */
public class TrappingRainWaterBruteForce {

    @Test
    public void testTrapRainWater() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapRainWater(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }

    public int trapRainWater(int[] height) {
        int save = 0;

        for (int i = 1; i < height.length-1; i++) { //O(n)
            //findLeftMax
            int lMaxHeight = findMax(height, i, "left"); //O(n)
            //findRightMax
            int rMaxHeight = findMax(height, i, "right"); //O(n)
            int units = Math.max(0, Math.min(lMaxHeight, rMaxHeight) - height[i]);
            save += units;
        }
        return save; //O(1)
    }

    public static int findMax(int[] height, int index, String direction) {
        int maxHeight = Integer.MIN_VALUE;
        if (direction.equals("left")) {
            for (int i = 0; i <= index; i++) {
                maxHeight = Math.max(maxHeight, height[i]);
            }
        } else {
            for (int i = index + 1; i < height.length; i++) {
                maxHeight = Math.max(maxHeight, height[i]);
            }
        }
        return maxHeight;
    }
}
