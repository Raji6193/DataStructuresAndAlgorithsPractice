package DataStructuresAndAlgorithmsPractice.SlidingWindow;

import org.junit.Test;

import java.util.HashMap;

public class FruitIntoBasket {
    @Test
    public void testFruitIntoBaskets() {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(totalFruit(fruits));
    }

    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, maxFruits = 0, currFruits = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
            currFruits++;
            while (map.size()>2){
                if(map.get(fruits[left])==1) map.remove(fruits[left]);
                else map.put(fruits[left], map.getOrDefault(fruits[left],0)-1);
                currFruits--;
                left++;
            }
            maxFruits=Math.max(maxFruits, currFruits);
            right++;
        }
        return maxFruits;
    }
}
