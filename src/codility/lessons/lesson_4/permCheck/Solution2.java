package codility.lessons.lesson_4.permCheck;

// 100 %
// Time complexity: O(N) or O(N * log(N))

public class Solution2 {

    public int solution(int[] A) {

        boolean[] result = new boolean[A.length];

        for (int i = 0; i < A.length; i++) {    // O(n)
            int index = A[i] - 1;
            if (index > A.length - 1) {
                return 0;
            }
            if (!result[index]) {
                result[index] = true;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
