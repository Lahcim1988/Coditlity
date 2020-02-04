package codility.maximumSlice.maxSliceSum;

public class Solution1 {

    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        int[] A = {3, 2, -6, 4, 0};
        System.out.println(solution1.solution(A));

    }

    public int solution(int[] A) {

        int n = A.length;
        int result = 0;

        if(A.length == 1){
            return A[0];
        }

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[i]; j++) {

                sum += A[j];
                if (result < sum) {
                    result = sum;
                }

            }
        }

        return result;
    }
}
