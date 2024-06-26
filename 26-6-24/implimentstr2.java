public class implimentstr2 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int h = haystack.length();
        int n = needle.length();
        if (n == 0) {
            return 0;
        }
        if (n > h) {
            return -1;
        }

        int[] next = getNext(needle);
        int i = 0;
        int j = 0;

        while (i < h) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == n) {
                    return i - j;
                }
            } else {
                j = next[j];
            }
        }
        return -1;
    }

 
    private int[] getNext(String needle) {
        int n = needle.length();
        int[] next = new int[n];
        int j = 0;
        int k = -1;
        next[0] = -1;

        while (j < n - 1) {
            if (k == -1 || needle.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
                if (needle.charAt(j) != needle.charAt(k)) {
                    next[j] = k;
                } else {
                    next[j] = next[k];
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {

        implimentstr2 solution = new implimentstr2();
        System.out.println(solution.strStr("hello", "ll")); 
        System.out.println(solution.strStr("aaaaa", "bba")); 
        System.out.println(solution.strStr("", "")); 
    }
}
