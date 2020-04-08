package codility.lessons.lesson_16.MaxNonoverlappingSegments;

// Time Complexity O(N)
// Task Score 100%

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(new Solution2().solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}) + " 3");
        System.out.println(new Solution2().solution(new int[]{}, new int[]{}) + " 0");

        System.out.println(new Solution2().solution(new int[]{1, 2, 3, 4, 5, 6}, new int[]{3, 4, 5, 6, 7, 8}) + " 2");
    }

    public int solution(int[] A, int[] B) {

        int length = A.length;
        int endSegment;
        int startNextSegment;
        int counter = 1;

        if (length == 0) {
            return 0;
        }

        int i = 0;
        int j = 1;
        while (j < length){
            endSegment = B[i];
            startNextSegment = A[j];

            if (endSegment > startNextSegment) {
                j++;
                continue;
            }
            if(endSegment < startNextSegment){
                counter ++;
                i = j;
            }
            j++;
        }
        return counter;
    }
}
