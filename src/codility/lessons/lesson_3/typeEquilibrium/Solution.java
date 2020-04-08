package codility.lessons.lesson_3.typeEquilibrium;

/* 100 % */

public class Solution {

    public static void main(String[] args) {

        Solution s = new Solution();
        int [] tab = {3, 1, 2, 4, 3};
        System.out.println(s.solution(tab));

    }

    public int solution(int[] A) {

        int left = A[0];
        int right = 0;

        for(int i: A){

            right += i;

        }

        right -= left;

        int diff = Math.abs(left - right);
        for (int i = 1; i < A.length-1; i++) {
            left += A[i];
            right -= A[i];
            int a = Math.abs(left - right);
            if(diff > a){
                diff = a;
            }
        }
        return diff;
    }
}
