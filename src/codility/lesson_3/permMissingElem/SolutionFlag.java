package codility.lesson_3.permMissingElem;

public class SolutionFlag {

    // Task Score 100%
    // Correctness 100%
    // Performance 100%
    // Detected time complexity: O(N) or O(N * log(N))

    public int solution(int[] A) {
        boolean[] resultArray = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {                    // 0(N)
            resultArray[A[i] - 1] = true;
        }

        for (int i = 0; i < resultArray.length; i++) {          // 1 to 0(N)
            if (!resultArray[i]) {    // false
                return i + 1;
            }
        }
        return 0;
    }
}
