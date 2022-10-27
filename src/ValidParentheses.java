import java.util.Stack;

public class ValidParentheses {

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
        Example 1:
            Input: s = "()"
            Output: true
        Example 2:
            Input: s = "()[]{}"
            Output: true
        Example 3:
            Input: s = "(]"
            Output: false
     */

    public static void main(String[] args) {
        System.out.println("isValidParentheses(\"()[]{}\") = " + isValidParentheses("([]){}"));
    }

    // 60/92 test cases passed
    private static boolean isValid(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char next = s.charAt(i + 1);
            if ((first == '(' && next != ')') || (first == '[' && next != ']') || (first == '{' && next != '}')) {
                return false;
            }
        }
        return true;
    }


    // OPTION 2 - Stack - 3 ms, faster than 62.32% & 42.4 MB, less than 18.60%
    private static boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                charStack.push(c);
            } else if (c == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
            } else if (c == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
            } else if (c == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
            } else {
                return false;
            }
        }
        return charStack.isEmpty();
    }
}