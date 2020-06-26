package codility.bracketsProblem;

import java.util.Stack;

public class Solution3 {

    public static void main(String[] args) {

        System.out.println(checkIfBracketsHavePairs("[()]{}{[()()]()}"));
        System.out.println(checkIfBracketsHavePairs("()[]}"));

    }

    private static boolean checkIfBracketsHavePairs(String br) {

        String [] arr = br.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < br.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (arr[i].equals("[") && stack.lastElement().equals("]")) {
                    stack.pop();
                }else if (arr[i].equals("]") && stack.lastElement().equals("[")) {
                    stack.pop();
                }else if (arr[i].equals("(") && stack.lastElement().equals(")")) {
                    stack.pop();
                }else if (arr[i].equals(")") && stack.lastElement().equals("(")) {
                    stack.pop();
                }else if (arr[i].equals("{") && stack.lastElement().equals("}")) {
                    stack.pop();
                }else if (arr[i].equals("}") && stack.lastElement().equals("{")) {
                    stack.pop();
                }else {
                    stack.push(arr[i]);
                }
            }
        }

        return stack.isEmpty();
    }
}
