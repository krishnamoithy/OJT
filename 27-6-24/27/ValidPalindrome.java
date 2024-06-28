// Solution 3 - Using Two Pointers
public class ValidPalindrome {
    public static boolean isValidPalindrome(String s) {
        if (s == null || s.length() == 0) return false;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "Programcreek is awesome";
        System.out.println(isValidPalindrome(str1)); // true
        System.out.println(isValidPalindrome(str2)); // false
    }
}
