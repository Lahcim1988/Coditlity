package codility.lessons.lesson_16.TieRopes;

//    Tie adjacent ropes to achieve the maximum number of ropes of length >= K.
// Detected time complexity: O(N)
// Task Score: 100%

public class Solution {

    public static void main(String[] args) {

        System.out.println(solution(3, new int[]{1, 3, 1}));

    }

    public static int solution(int K, int[] A) {

        int length = A.length;
        int countRope = 0;
        int sumOfTiedRope = 0;

        for (int i = 0; i < length; i++) {
            if (A[i] >= K) {
                countRope++;
                sumOfTiedRope = 0;
                continue;
            }
            if (sumOfTiedRope < K) {
                sumOfTiedRope += A[i];

                if (sumOfTiedRope >= K) {
                    countRope++;
                    sumOfTiedRope = 0;
                }
            }
        }
        return countRope;
    }

}
