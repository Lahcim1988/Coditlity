package codility.lesson_3.typeEquilibrium;

// time complexity: O(N)
// Task Score 100%
// Correctness 100%
// Performance 100%

public class Solution2 {

    public static void main(String[] args) {

        Solution2 sol = new Solution2();
        System.out.println(sol.solution(new int[]{-10, -20, -30, -40, 100}) + " ex 20");
        System.out.println(sol.solution(new int[]{-1000, 1000})+ " ex 2000");
        System.out.println(sol.solution(new int[]{1, 1}) + " ex 0");
        System.out.println(sol.solution(new int[]{3, 1, 2, 4, 3})+ " ex 1");
        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 10})+ " ex 0");
    }

    public int solution(int[] A) {

        int a = 0;
        int b = 0;

        //a = Arrays.stream(A).sum();
        for (int sum: A) {
            a = a + sum;
        }

        int max = 100000;

        for (int i = 0; i < A.length - 1; i++) {
            b = b + A[i];
            a = a - A[i];
            int c = b - a;
            if(c < 0){
                c = c * (-1);}
            if (c < max) {
                max = c;
            }
        }
        return max;
    }
}
