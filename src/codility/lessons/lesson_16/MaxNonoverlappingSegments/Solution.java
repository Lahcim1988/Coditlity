package codility.lessons.lesson_16.MaxNonoverlappingSegments;

// Time Complexity O(N)
// Task Score 100%

public class Solution {

    public int solution(int[] A, int[] B) {
        int lastEndSegment = -1;
        int chosenCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > lastEndSegment) {
                chosenCount++;
                lastEndSegment = B[i];
            }
        }
        return chosenCount;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}));
    }

}
