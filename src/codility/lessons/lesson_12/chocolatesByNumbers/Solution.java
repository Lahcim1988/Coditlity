package codility.lessons.lesson_12.chocolatesByNumbers;

public class Solution {


    public int solution(int N, int M){

        return N / GCD(N, M);
    }

    private int GCD(int N, int M){

        if(M == 0){
            return N;
        }else{
            return GCD(M, N % M);
        }
    }
}
