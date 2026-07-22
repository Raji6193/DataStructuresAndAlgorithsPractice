package DataStructuresAndAlgorithmsPractice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class primeNumberUntilN {

    @Test
    public void testPrimeNumbers() {
        int n = 20;
        System.out.println(primeNumber(n));
    }

    public List<Integer> primeNumber(int n) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

    private boolean isPrime(int num) {
        if (num <= 1)
            return true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
