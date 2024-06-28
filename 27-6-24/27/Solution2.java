import java.util.Stack;

public class Solution2 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = s.length();
        if (len < 2) return true;
        
        Stack<Character> stack = new Stack<>();
        int index = 0;
        
        while (index < len / 2) {
            stack.push(s.charAt(index));
            index++;
        }
        
        if (len % 2 == 1) index++;
        
        while (index < len) {
            if (stack.empty()) return false;
            char temp = stack.pop();
            if (s.charAt(index) != temp) return false;
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "Programcreek is awesome";
        System.out.println(sol.isPalindrome(str1)); // true
        System.out.println(sol.isPalindrome(str2)); // false
    }
}
