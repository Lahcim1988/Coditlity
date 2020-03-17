package codility.voraciousFish;

import java.util.Stack;

/* 100 % */

public class Solution100 {

    public static void main(String[] args) {

        Solution100 sol = new Solution100();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};

        System.out.println(sol.solution(A, B));

    }

    public int solution(int[] A, int[] B) {

        Stack<Integer> stack = new Stack<>();
        int counter = 0;

        for (int i = 0; i < A.length; i++) {
            int weight = A[i];

            if (B[i] == 1) {
                stack.push(weight);
            } else {

                int weightDown = stack.isEmpty() ? -1 : stack.pop();

                while (weightDown != -1 && weightDown < weight) {
                    weightDown = stack.isEmpty() ? -1 : stack.pop();
                }
                if (weightDown == -1) {
                    counter += 1;
                } else {
                    stack.push(weightDown);
                }
            }
        }
        return counter + stack.size();
    }
}
