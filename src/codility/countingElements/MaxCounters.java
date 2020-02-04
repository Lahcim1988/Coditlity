package codility.countingElements;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        MaxCounters max = new MaxCounters();
        int [] A = {3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(max.solution(5, A)));

    }

    public int[] solution(int N, int[] A){

        int counter [] = new int[N];
        Arrays.fill(counter, 0);


        for (int i : A) {

            if (i >= N) {

                int max = counter[0];
                for (int cou = 1; cou < counter.length; cou++) {

                    if (counter[cou] > max) {
                        max = counter[cou];
                    }

                }
                for (int a = 0; a < counter.length; a++) {

                    counter[a] = max;

                }

            } else {

                counter[i - 1] += 1;

            }
        }

        return counter;


    }

}
