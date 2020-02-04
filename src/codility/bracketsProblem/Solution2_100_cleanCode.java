package codility.bracketsProblem;

import java.util.Stack;

/* 100 % */

public class Solution2_100_cleanCode {

    public static void main(String[] args) {

        Solution2_100_cleanCode sol = new Solution2_100_cleanCode();
        System.out.println(sol.solution(""));
        System.out.println(sol.solution("{{{{{"));
        System.out.println(sol.solution("{}{}{[}"));
        System.out.println(sol.solution("{[()]}()"));

    }


    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return 0;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}

