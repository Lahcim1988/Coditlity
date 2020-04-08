package codility.missingInteger;

import java.util.Arrays;

// Time complexity O(N) or O(N * log(N))
// Task Score 100%

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
