package codility.lesson_2.cyclingRotation;

import java.util.Arrays;

// Task Score 100%
// Correctness 100%

public class SolutionModulo {

    public static void main(String[] args) {

        SolutionModulo modulo = new SolutionModulo();
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(modulo.solution(tab, 9)));

        int[] tab1 = {};
        System.out.println(Arrays.toString(modulo.solution(tab1, 4)));

    }

    public int[] solution(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < result.length; i++) {
            result[(i + K) % A.length] = A[i];
        }

        return result;

    }
}
