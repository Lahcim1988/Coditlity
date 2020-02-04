package codility.prefixSums.passingCars;

public class Solution100 {

    public static void main(String[] args) {

        Solution100 solution1 = new Solution100();
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution1.solution(A));

        int[] B = {1, 1, 1, 1, 1};
        System.out.println(solution1.solution(B));



    }

    public int solution(int[] A) {

        int[] sufixSum = new int[A.length + 1];

        for (int i = A.length - 1; i >= 0; i--) {
            sufixSum[i] = A[i] + sufixSum[i + 1];
        }

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                result += sufixSum[i];
            }
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
    }

}
