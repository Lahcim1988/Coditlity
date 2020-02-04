package codility.prefixSums.countDiv;

public class Solution3 {

    public static void main(String[] args) {

        Solution3 sol = new Solution3();
        System.out.println(sol.solution(6, 11, 2));


    }


    public int solution(int A, int B, int K) {

        double firstDiv = 0;
        double lastDiv = 0;

        firstDiv = Math.ceil(A / (double)K);
        lastDiv = Math.floor(B / (double)K);

        return (int) (lastDiv - firstDiv + 1);
    }

}
