package codility.dominatorLeader;

/* 100 % */

public class Solution2_100_CleanCode {

    public static void main(String[] args) {

        Solution2_100_CleanCode solution = new Solution2_100_CleanCode();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution.solution(A));

    }
    public int solution(int[] A) {

        int counter = 0;
        int candidate = 0;

        for (int item : A) {
            if (counter == 0) {
                candidate = item;
                counter += 1;
            } else if (candidate == item) {
                counter += 1;
            } else {
                counter -= 1;
            }
        }

        int repeat = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                repeat++;
                index = i;
            }
        }

        return repeat > A.length / 2.0 ? index : -1;

    }
}
