package codility.maximumSlice.maxProfit;

/* 100% */

public class Solution100 {

    public static void main(String[] args) {

        Solution100 solution = new Solution100();
        int [] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution.solution(A));

        int [] B = {5, 4, 3, 2, 1};
        System.out.println(solution.solution(B));
    }

    public int solution(int[] A) {

        if(A.length == 0){
            return 0;
        }

        int [] B = new int[A.length - 1];

        for (int i = 0; i < B.length; i++) {

            B[i] = A[i + 1] - A[i];

        }

        int globalMax = B[0];
        int localMax = B[0];


        for (int i = 1; i < B.length; i++) {

            if (B[i] <= localMax + B[i]) {

                localMax = localMax + B[i];

            } else if (B[i] > localMax + B[i]) {

                localMax = B[i];

            }

            if (localMax > globalMax) {

                globalMax = localMax;

            }
        }

        if(globalMax < 0){
            return 0;
        }

        return globalMax;

    }
}
