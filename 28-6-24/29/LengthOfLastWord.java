public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int result = 0;
        int len = s.length();
        boolean flag = false;
        
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                flag = true;
                result++;
            } else {
                if (flag) {
                    return result;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(solution.lengthOfLastWord(" ")); // Output: 0
        System.out.println(solution.lengthOfLastWord("a ")); // Output: 1
    }
}
