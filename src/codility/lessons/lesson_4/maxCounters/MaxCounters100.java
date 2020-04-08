package codility.lessons.lesson_4.maxCounters;

import java.util.Arrays;

/* 100 % */

public class MaxCounters100 {

    public static void main(String[] args) {

        MaxCounters100 max = new MaxCounters100();
        int [] A = {3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(max.solution(5, A)));

    }


    public int[] solution(int N, int[] A) {

        int[] counter = new int[N];
        Arrays.fill(counter, 0);

        int startLine = 0;
        int currentMax = 0;


        for (int i : A) {

            if (i > N) {
                startLine = currentMax;
            } else if (counter[i - 1] < startLine) {
                counter[i - 1] = startLine + 1;
            } else {
                counter[i - 1] += 1;
            }

            if (i <= N && counter[i - 1] > currentMax) {

                currentMax = counter[i - 1];
            }
        }
        for (int j = 0; j < counter.length; j++) {
            if (counter[j] < startLine) {
                counter[j] = startLine;
            }
        }

        return counter;
    }
}
