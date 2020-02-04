package codility.arrays.cyclingRotation;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {

        Solution100 s = new Solution100();
        int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(s.solution(tab, 11)));

        int tab1[] = {};
        System.out.println(Arrays.toString(s.solution(tab1, 4)));

    }

    public int[] solution(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < result.length; i++) {
            result[(i + K) % A.length] = A[i];
        }

        return result;

    }
}
