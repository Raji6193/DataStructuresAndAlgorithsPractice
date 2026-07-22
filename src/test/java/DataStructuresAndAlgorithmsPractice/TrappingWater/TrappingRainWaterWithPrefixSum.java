package DataStructuresAndAlgorithmsPractice.TrappingWater;

import org.junit.Test;

/**
 * Initialise variables save=0;
 * 
 * 
 * TimeComplexity O(n) + O(n) + O(n) = O(n)
 * SpaceComplexity O(n) + O(n) = O(n)
 */
public class TrappingRainWaterWithPrefixSum {

    @Test
    public void testTrapRainWaterPrefixSum() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapRainWater(height));
//        Assertions.assertEquals(6, TrappingRainWater.trapRainWater(height));
    }


    public int trapRainWater(int[] height) {
        int save = 0;
        int[] leftPrefixHeight = new int[height.length]; //O(1)
        int[] rightPrefixHeight = new int[height.length]; //O(1)
        leftPrefixHeight[0] = height[0];

        //find left max heights and store
        for (int i = 1; i < height.length; i++) { //O(n)
            leftPrefixHeight[i] = Math.max(leftPrefixHeight[i - 1], height[i]);
        }

        //find left max heights and store
        rightPrefixHeight[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i > 0; i--) { //O(n)
            rightPrefixHeight[i] = Math.max(rightPrefixHeight[height.length-2], height[i]);
        }
        
        for (int i = 1; i < height.length - 1; i++) { //O(n)
            // some times Math.min(leftPrefixHeight[i], rightPrefixHeight[i]) - height[i] can be negative, so we need to take max with 0
            int units = Math.max(0, Math.min(leftPrefixHeight[i], rightPrefixHeight[i]) - height[i]);
            save += units;
        }
        return save; //O(1)
    }
    
}
