package codility.lesson_3.typeEquilibrium;

import java.util.ArrayList;
import java.util.Collections;

public class Equilibrium {

    // N is an integer within the range [2..100,000];
    // each element of array A is an integer within the range [−1,000..1,000].

    public static void main(String[] args) {

        Equilibrium e = new Equilibrium();
        int [] tab = {3, 1, 2, 4, 3};

        System.out.println(e.solution(tab));

    }


    public int solution(int[] A) {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        arr1.add(A[0]);

        for (int i = A.length - 1; i > 0; i--) {

            arr2.add(A[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < (A.length - 2); i++) {

            arr1.add(A[i]);
            arr2.remove(arr2.get(arr2.size() - 1));

            int sum1 = 0;
            for (int s : arr1) {
                sum1 += s;
            }

            int sum2 = 0;
            for (int s : arr2) {
                sum2 += s;
            }

            int sum = Math.abs(sum1 - sum2);
            result.add(sum);

        }

        Collections.sort(result);
        int exp = result.get(0);
        return exp;
    }

}
