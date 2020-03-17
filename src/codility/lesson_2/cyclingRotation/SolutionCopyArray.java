package codility.lesson_2.cyclingRotation;

// Task Score 100%
// Correctness 100%

public class SolutionCopyArray {

    public int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
        K = K % A.length;
        if (K == 0) return A;

        int[] result = new int[A.length];

        System.arraycopy(A, A.length - K, result, 0, K);
        System.arraycopy(A, 0, result, K, A.length - K);

        return result;
    }
}
