package codility.lessons.lesson_16.TieRopes;

//    Tie adjacent ropes to achieve the maximum number of ropes of length >= K.
// Detected time complexity: O(N)
// Task Score: 100%

public class Solution2 {

    public static int solution(int K, int[] A) {

        int ropeLength = 0;
        int countRope = 0;

        for (int value : A) {
            ropeLength += value;
            if (ropeLength >= K) {
                countRope++;
                ropeLength = 0;
            }
        }
        return countRope;
    }
}
