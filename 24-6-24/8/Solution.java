public class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for pattern p
        int starIndex = -1; // Position of '*' in pattern p
        int iIndex = -1; // Position in s where '*' match started

        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                // Characters match or '?' in pattern
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                // Found '*', mark the position and move pattern pointer
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                // Current characters don't match, backtrack to '*' position
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                // No match found
                return false;
            }
        }

        // Handle remaining '*' in pattern
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        // Check if all characters in pattern have been consumed
        return j == p.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("aa", "a")); // false
        System.out.println(solution.isMatch("aa", "*")); // true
        System.out.println(solution.isMatch("cb", "?a")); // false
        System.out.println(solution.isMatch("adceb", "*a*b")); // true
        System.out.println(solution.isMatch("acdcb", "a*c?b")); // false
    }
}
