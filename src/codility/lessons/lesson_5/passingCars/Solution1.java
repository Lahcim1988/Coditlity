package codility.lessons.lesson_5.passingCars;

public class Solution1 {

    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution1.solution(A));

        int[] B = {1, 1, 1, 1, 1};
        System.out.println(solution1.solution(B));

    }


    public int solution(int[] A) {

        if (A.length > 1000000) {
            return -1;
        }
        int[] prefix = new int[A.length + 1];

        prefix[0] = 0;
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        int summary = 0;
        for (int i = 0; i < A.length; i++) {
            summary += prefix[i];
            if (summary >= 1000000000) {
                return -1;
            }
        }

        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if(A[i] == A[i - 1]){
                count ++;
                if(count == A.length){
                    return 0;
                }
            }else if (A[i] != A[i - 1]){
                break;
            }
        }

        return summary;
    }




}
