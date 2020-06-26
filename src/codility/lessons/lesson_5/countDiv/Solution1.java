package codility.lessons.lesson_5.countDiv;

public class Solution1 {

    /* 62 %*/

    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
  //      System.out.println(solution1.SolutionXOR(6, 11, 2));
        System.out.println(solution1.solution(0, 0, 11));

    }

    public int solution(int A, int B, int K) {

        int firstDiv = 0;
        int lastDiv = 0;

        if(B > 2000000000 || K > 2000000000){
            return -1;
        }
        if(K > B){
            return 0;
        }

        while (firstDiv == 0 || lastDiv == 0) {

            if(A < K){
                firstDiv = K;
            }else if (A % K == 0) {
                firstDiv = A;
            } else {
                A++;
            }

            if (B % K == 0) {
                lastDiv = B;
            } else {
                B--;
            }
        }

        int result = (lastDiv - firstDiv) / K + 1;

        return result;
    }
}


