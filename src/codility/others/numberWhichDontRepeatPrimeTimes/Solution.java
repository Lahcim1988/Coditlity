package codility.others.numberWhichDontRepeatPrimeTimes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] A = {2, 3, 9, 2, 5, 1, 3, 7, 10};
        int[] B = {2, 1, 3, 4, 3, 3, 6, 6, 1, 7, 10, 10, 10};
        int[] C = {2, 9, 2, 5, 7, 10};

        //SolutionXOR SolutionXOR = new SolutionXOR();

        long startTime = System.nanoTime();


        System.out.println(Arrays.toString(solution(A, B)));

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);



/*        int[] D = {1, 2, 3, 4, 5};
        int[] E = {1, 1, 1, 1, 1, 1, 1, 2, 4, 4, 5, 5, 5, 5, 5, 5, 5};
        int[] F = {2, 3};

        System.out.println(Arrays.toString(SolutionXOR.SolutionXOR(D, E)));*/



    }

    // 0(n + m) + 0(√n)

    public static int[] solution(int[] A, int[] B) {

        int n = B.length;

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

    /*Primality test — O(√n).*/
    // If number i is divisor of number n, than n/i is also a divisor.
    // One of these two divisor is less than or equal to √n.
    // Iterating thought 1 to √n allows us to find all dhe divisor.
    // Time complexity O(√n) instead of O(n) (iterate through 1 to n)

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
