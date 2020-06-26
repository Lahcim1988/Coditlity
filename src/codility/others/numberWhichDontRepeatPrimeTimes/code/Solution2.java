package codility.others.numberWhichDontRepeatPrimeTimes.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution2 {

    // O (n^2)
    Object[] getNumberWhichDontRepeatPrimeTimes(int[] table1, int[] table2) {
        List<Integer> result = new ArrayList<>();
        for (int number1 : table1) {
            if (result.contains(number1)) {
                result.add(number1);
            } else {
                int countOfNumber1inTable2 = ((int) Arrays.stream(table2).filter(number2 -> number2 == number1).count());
                if (!isPrime(countOfNumber1inTable2)) {
                    result.add(number1);
                }
            }
        }
        return result.toArray();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);
    }
}
