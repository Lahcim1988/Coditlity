package codility.arrays.cyclingRotation;

import java.util.Arrays;

/* 100 % */

public class Solution100 {

    public static void main(String[] args) {

        Solution100 s = new Solution100();
        int tab[] = {7, 2, 3, 4};
        System.out.println(Arrays.toString(s.solution(tab, 3)));

        int tab1[] = {1, 3, 1};
        System.out.println(Arrays.toString(s.solution(tab1, 4)));

    }

    public int[] solution(int[] A, int K) {

        K = A.length % K;

        while (K > 0 && A.length > 0) {

            int T = A[A.length - 1];

            System.arraycopy(A, 0, A, 1, A.length - 1);
            A[0] = T;
            K--;
        }
        return A;
    }
}