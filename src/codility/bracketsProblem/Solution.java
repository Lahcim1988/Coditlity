package codility.bracketsProblem;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution("({{({}[]{})}}[]{})"));


    }

    public int solution(String S) {

        char[] charS = new char[S.length()];

        for (int i = 0; i < S.length(); i++) {
            charS[i] = S.charAt(i);
        }

        if (S.length() % 2 != 0) {

            return 0;

        } else {

            for (int i = 0; i < S.length() / 2; i++) {

                if (charS[i] == '(' && charS[i + 1] == ')' ||
                        charS[i] == '{' && charS[i + 1] == '}' ||
                        charS[i] == '[' && charS[i + 1] == ']') {
                    i++;
                    continue;

                } else if (charS[i] == '(' && charS[charS.length - 1 - i] == ')' ||
                        charS[i] == '{' && charS[charS.length - 1 - i] == '}' ||
                        charS[i] == '[' && charS[charS.length - 1 - i] == ']') {

                    continue;

                } else {

                    return 0;

                }

            }
            return 1;
        }


    }
}

