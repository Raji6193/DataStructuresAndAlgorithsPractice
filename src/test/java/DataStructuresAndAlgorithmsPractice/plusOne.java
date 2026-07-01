package DataStructuresAndAlgorithmsPractice;

public class plusOne {

    public static int[] plusOneArray(int[] digits) {
        int num = 0;
        int size = digits.length==1 && digits[0]==9 ? digits.length+1 : digits.length;
        for(int i=0; i<digits.length; i++) {
            if(digits[i]==9) {
                size = digits.length+1;
            }
            else {
                size = digits.length;
                break;
            }
        }
        int[] result = new int[size];

        for (int i = 0; i < digits.length; i++) {
                num = num * 10 + digits[i];
        }
        num = num+1;
        
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = num % 10;
            num = num / 10;
        }
        return result;
    }
}
