package codility.bracketsProblem;

import java.util.Stack;

/* 100 % */

public class Solution2_100 {

    public static void main(String[] args) {

        Solution2_100 solution2 = new Solution2_100();
        System.out.println(solution2.solution("())(()"));

    }


    public int solution(String S) {

        Stack stack = new Stack();

        char[] charS = new char[S.length()];

        for (int i = 0; i < S.length(); i++) {
            charS[i] = S.charAt(i);
        }

        if (S.length() % 2 != 0) {

            return 0;

        } else if (S.isEmpty()) {
            return 1;

        } else if (charS[0] == ')' || charS[0] == '}' || charS[0] == ']') {

            return 0;

        } else {

            for (int i = 0; i < charS.length; i++) {

                if (charS[i] == '(' || charS[i] == '{' || charS[i] == '[') {

                    stack.push(charS[i]);

                } else if (stack.empty() && (charS[i] == ')' || charS[i] == '}' || charS[i] == ']')) {

                    return 0;

                } else {
                    if (charS[i] == ')' && stack.lastElement().equals('(') ||
                            charS[i] == '}' && stack.lastElement().equals('{') ||
                            charS[i] == ']' && stack.lastElement().equals('[')) {

                        stack.pop();
                        continue;
                    } else {

                        return 0;
                    }
                }
            }

            if (stack.empty()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
