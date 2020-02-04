package codility.dominatorLeader;

/* 100 % */

public class Solution2_100 {

    public static void main(String[] args) {

        Solution2_100 solution = new Solution2_100();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution.solution(A));

    }

    public int solution(int[] A) {

        int candidate = 0;
        int counter = 0;
        int half = A.length / 2;

        for (int i = 0; i < A.length; i++) {

            if (counter == 0) {

                candidate = A[i];
                counter++;

            } else if (candidate != A[i]) {

                counter--;

            } else if (candidate == A[i]) {

                counter++;
            }
        }

        if (candidate == 0) {

            return -1;
        }

        int repeat = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {

                repeat++;

            }

        }

        if (repeat > half) {

            for (int i = 0; i < A.length; i++) {

                if(A[i] == candidate){

                    return i;

                }
            }
        }

            return -1;

    }
}
