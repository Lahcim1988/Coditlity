package codility.caterpillarMethod;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(6, new int[]{3, 4, 5, 5, 2}));


    }

    public int solution(int M, int[] A) {

        int counter = 0;
        boolean dupeArr[] = new boolean[M + 1];
        Arrays.fill(dupeArr, false);
        int frontPointer = 0;

        for (int backPointer = 0; backPointer < A.length; backPointer++) {
            while (frontPointer < A.length && !dupeArr[A[frontPointer]]) {
                dupeArr[A[frontPointer]] = true;
                counter += (frontPointer - backPointer) + 1;
                frontPointer += 1;
                if (counter > 1000000000) {
                    counter = 1000000000;
                }
            }
            dupeArr[A[backPointer]] = false;
        }
        return counter;
    }
}
