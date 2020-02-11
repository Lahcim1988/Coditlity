package codility.arrays.oddOccurrencesInArray;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {

            int elem = 0;

            for (int i = 0; i < A.length; i++) {
                elem ^= A[i];
            }
            return elem;
        }



    public static void main(String[] args) {

       int[] A = {4, 4, 5, 4, 4, 4, 4, 4, 4, 4, 4};



        System.out.println(solution(A));

    }
}