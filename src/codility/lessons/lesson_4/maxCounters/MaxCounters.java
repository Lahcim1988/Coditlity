package codility.lessons.lesson_4.maxCounters;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        MaxCounters max = new MaxCounters();
        int [] A = {3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(max.solution(5, A)));

    }

    public int[] solution(int N, int[] A) {

        int len = A.length;
        int max = 0;
        int ifmax;

        int[] result = new int[N];

        for (int i = 0; i < len; i++) {

            if (A[i] > N) {
                Arrays.fill(result, max);
            }
            else if (A[i] <= N) {
                result[A[i] - 1] ++;
                ifmax = result[A[i] - 1];
                if (max <= ifmax) {
                    max = ifmax;
                }
            }
        }
        System.out.println(max);

        return result;

    }

}
