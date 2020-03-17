package codility.lesson_3.permMissingElem.stream70;

import java.util.Arrays;

public class SolutionArrayStream {


    // Task Score 70%
    // Correctness 100%
    // Performance 40%
    public int solution(int[] A) {

        int sum = Arrays.stream(A).sum();

        int length = A.length + 1;

        int totalSum = (length * (length + 1)) / 2;

        return totalSum - sum;
    }

    public static void main(String[] args) {

        System.out.println(new SolutionArrayStream().solution(new int[]{1, 2, 3, 4, 5, 6, 8, 9}));
    }
}
