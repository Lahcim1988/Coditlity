package codility.primeAndCompositeNumber;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] A = new int[12];
        A[0] = 1;
        A[1] = 5;
        A[2] = 3;
        A[3] = 4;
        A[4] = 3;
        A[5] = 4;
        A[6] = 1;
        A[7] = 2;
        A[8] = 3;
        A[9] = 4;
        A[10] = 6;
        A[11] = 2;

        System.out.println(solution.solution(A));

    }


    public int solution(int[] A) {

        int next = A.length;

        int[] peak = new int[A.length];

        peak[A.length - 1] = next;

        for (int i = A.length - 2; i > 0; i--) {        // last/first element can not be a pick
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                next = i;
            }
            peak[i] = next;
        }
        peak[0] = next;

        int guess = 0;
        int nextGuess = 0;

        while (flags(peak, nextGuess)) {
            guess = nextGuess;
            nextGuess += 1;
        }
        return guess;
    }

    private boolean flags(int[] peak, int flagsToPlace) {

        int position = 1 - flagsToPlace;
        for (int i = 0; i < flagsToPlace; i++) {
            if (position + flagsToPlace > peak.length - 1) {
                return false;
            }
            position = peak[position + flagsToPlace];
        }
        return position < peak.length;
    }


}
