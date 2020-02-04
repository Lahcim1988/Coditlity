package codility.maximumSlice.maxProfit;

public class Solution100CleanCode {

    public static void main(String[] args) {

        Solution100CleanCode solution = new Solution100CleanCode();
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution.solution(A));

        int[] B = {5, 4, 3, 2, 1};
        System.out.println(solution.solution(B));
    }

    public int solution(int[] A) {

        int globalMaxSum = 0;
        int localMaxSum = 0;

        for (int i = 1; i < A.length; i++) {
            int delta = A[i] - A[i - 1];
            localMaxSum = Math.max(delta, localMaxSum + delta);
            globalMaxSum = Math.max(localMaxSum, globalMaxSum);
        }
        return globalMaxSum;
    }

}
