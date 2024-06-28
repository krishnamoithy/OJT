public class Solution1 {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.length() < 2) return true;
        
        char[] charArray = s.toCharArray();
        int len = s.length();
        int i = 0;
        int j = len - 1;
        
        while (i < j) {
            while (i < j && !isAlphaNumeric(charArray[i])) {
                i++;
            }
            while (i < j && !isAlphaNumeric(charArray[j])) {
                j--;
            }
            if (i < j && Character.toLowerCase(charArray[i]) != Character.toLowerCase(charArray[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "Programcreek is awesome";
        System.out.println(sol.isPalindrome(str1)); // true
        System.out.println(sol.isPalindrome(str2)); // false
    }
}
