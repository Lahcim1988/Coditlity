package codility.challenges.missingInteger;

import java.util.Arrays;

// Time complexity O(N) or O(N * log(N))
// Task Score 100%

// Find the smallest positive integer that does not occur in a given sequence.
// https://app.codility.com/demo/take-sample-test/?skip_intro=1

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int result = 1;
        for (int value : A) {
            if (value == result) {
                result++;
            } else if (value > result) {
                return result;
            }
        }
        return result;
    }
}

