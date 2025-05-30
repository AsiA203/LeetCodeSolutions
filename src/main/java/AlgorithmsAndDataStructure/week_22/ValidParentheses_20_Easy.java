package AlgorithmsAndDataStructure.week_22;

import java.util.Stack;

public class ValidParentheses_20_Easy {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("({})[{"));
        System.out.println(isValid("({[]})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }
}
