package codility.lesson_4.permCheck;

import java.util.Arrays;

// 100 %
// Time complexity: O(N) or O(N * log(N))

public class Solution {


    public int solution(int[] A) {

        Arrays.sort(A);

        if (A[A.length - 1] == A.length) {
            for (int i = 0; i < A.length - 1; i++) {
                if(A[i] == A[i + 1]){
                    return 0;
                }
            }
            return 1;
        }

        return 0;
    }
}
