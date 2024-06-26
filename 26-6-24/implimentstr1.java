public class implimentstr1 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        implimentstr1 solution = new implimentstr1();
        System.out.println(solution.strStr("hello", "ll")); // Output: 2
        System.out.println(solution.strStr("aaaaa", "bba")); // Output: -1
        System.out.println(solution.strStr("", "")); // Output: 0
    }
}
