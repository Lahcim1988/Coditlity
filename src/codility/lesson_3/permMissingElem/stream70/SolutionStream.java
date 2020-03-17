package codility.lesson_3.permMissingElem.stream70;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionStream {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 5};           // 4
        int[] B = {1, 3, 4, 5, 6, 7, 8};     // 2
        int[] C = {2, 3, 4, 5, 6, 7, 8, 9};   // 1
        int[] D = {1};                 // 2
        int[] E = {2};                 // 1
        int[] F = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] G = null;
        int[] H = {};
        int[] I = {4, 2, 3, 5, 1, 6, 8, 9};
        int[] J = {1, 2};


        SolutionStream s = new SolutionStream();
        System.out.println(s.solution(A) + " expected 4");
        System.out.println(s.solution(B) + " expected 2");
        System.out.println(s.solution(C) + " expected 1");
        System.out.println(s.solution(D) + " expected 2");
        System.out.println(s.solution(E) + " expected 1");
        System.out.println(s.solution(F) + " expected 8");
        System.out.println(s.solution(G) + " expected 1");
        System.out.println(s.solution(H) + " expected 1");
        System.out.println(s.solution(I) + " expected 7");
        System.out.println(s.solution(J) + " expected 3");

    }

    // Task Score 60%
    // Correctness 100%
    // Performance 20%

    public int solution(int[] A) {

        int length = A.length + 1;

        IntStream integers = Arrays.stream(A);

        int sum = integers.reduce(0, Integer::sum);

        int totalSum = (length * (length + 1)) / 2;

        return totalSum - sum;
    }
}
