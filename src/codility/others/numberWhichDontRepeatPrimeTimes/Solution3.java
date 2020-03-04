package codility.others.numberWhichDontRepeatPrimeTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {




    public int[] solution(int[] A, int[] B) {

        int n = B.length;

        List<Integer> list = new ArrayList<>();



        int [] countB = new int[n + 1];              // array counter
        Arrays.fill(countB, 0);

        // each B number counted in the array by using an index that corresponds to the value of the given number
        /* Counting elements — O(n) */
        for (int value : B) {



            countB[value] += 1;
        }

        int [] C = new int[0];

        /* Counting elements — O(m) */
        for (int value : A) {
            int counterValue = countB[value];

            if (counterValue == 0 || counterValue == 1 || !div(counterValue)) {
                C = Arrays.copyOf(C, C.length + 1);
                C[C.length - 1] = value;
            }
        }

        return C;

    }

    private static boolean div(int n) {

        int i = 2;              // 1 is neither a prime nor a composite number
        while (i * i <= n) {    // If the number between 2 and n - 1 that divides n, n - composite number, else n - prime number
            if (n % i == 0) {
                return false;
            }
            i += 1;
        }
        return true;
    }
}
