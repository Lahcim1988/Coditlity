package codility.lessons.lesson_5.countDiv;

public class Solution2 {

    public int solution(int A, int B, int K) {

        int firstDiv = 0;
        int lastDiv = 0;

        while (firstDiv == 0) {

            if (A < K) {
                firstDiv = K;
            } else if (A % K == 0) {
                firstDiv = A;
            } else {
                A++;
            }
        }

        while (lastDiv == 0){

            if(B % K == 0){
                lastDiv = B;
            }else {
                B++;
            }
        }

        int result = (lastDiv / K) - (firstDiv / K) + 1;


        return -1;
    }

}
