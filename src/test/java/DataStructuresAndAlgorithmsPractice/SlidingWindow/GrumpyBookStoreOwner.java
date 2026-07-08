package DataStructuresAndAlgorithmsPractice.SlidingWindow;

public class GrumpyBookStoreOwner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int totalSatisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }
        
        int extra = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra = extra + customers[i];
            }
        }
        
        int maxExtra = 0;
        maxExtra = Math.max(maxExtra, extra);
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i - minutes] == 1) {
                extra = extra - customers[i - minutes];
            }
            if (grumpy[i] == 1) {
                extra = extra + customers[i];
            }
            maxExtra = Math.max(maxExtra, extra);
        }

        return totalSatisfied + maxExtra;
    }
}
