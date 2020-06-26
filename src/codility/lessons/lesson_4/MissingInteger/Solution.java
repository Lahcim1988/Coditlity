package codility.lessons.lesson_4.MissingInteger;

// Find the smallest positive integer that does not occur in a given sequence.
// Detected time complexity: O(N) or O(N * log(N))
// Task Score 100 %

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {

        int missingElement = 1;

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] == missingElement) {
                missingElement = A[i] + 1;
            }
        }

        return missingElement;
    }
}
