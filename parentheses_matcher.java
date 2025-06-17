import java.util.Stack;

public class parentheses_matcher {

    // Function to check if the parentheses are balanced
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty, it means no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();  // Pop the top element

                // Check if it matches the current closing bracket
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Example strings to test
        String test1 = "{[()]}";       // Balanced
        String test2 = "{[(])}";       // Not balanced
        String test3 = "((()))";       // Balanced
        String test4 = "({[})";        // Not balanced

        System.out.println(test1 + " → " + areParenthesesBalanced(test1));
        System.out.println(test2 + " → " + areParenthesesBalanced(test2));
        System.out.println(test3 + " → " + areParenthesesBalanced(test3));
        System.out.println(test4 + " → " + areParenthesesBalanced(test4));
    }
}

