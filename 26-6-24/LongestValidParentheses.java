import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<int[]> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                int[] a = {i, 0};
                stack.push(a);
            } else {
                if (stack.isEmpty() || stack.peek()[1] == 1) {
                    int[] a = {i, 1};
                    stack.push(a);
                } else {
                    stack.pop();
                    int currentLen = 0;
                    if (stack.isEmpty()) {
                        currentLen = i + 1;
                    } else {
                        currentLen = i - stack.peek()[0];
                    }
                    result = Math.max(result, currentLen);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("(()"));         
        System.out.println(longestValidParentheses(")()())"));      
        System.out.println(longestValidParentheses(""));            
        System.out.println(longestValidParentheses("()(()"));      
        System.out.println(longestValidParentheses("(()(((()"));   
    }
}
