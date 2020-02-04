package codility.dominatorLeader;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution.solution(A));

    }

    public int solution(int[] A) {

        Stack<Integer> stack = new Stack<>();
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            int number = A[i];

            if (stack.empty()) {
                stack.push(number);
            } else {

                if (stack.lastElement() != number) {

                    stack.pop();

                } else {

                    stack.push(number);
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == stack.lastElement()) {
                counter++;
            }
        }
        if (counter > A.length / 2) {

            return stack.lastElement();

        } else {
            return -1;
        }
    }
}
