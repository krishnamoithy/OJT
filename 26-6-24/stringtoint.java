public class StringToInt {
    public static int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        
        // Trim leading and trailing whitespaces
        str = str.trim();
        
        if (str.length() == 0) {
            return 0;
        }
        
        char flag = '+';
        int i = 0;
        
        // Check for the sign
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        
        // Use long to store the result to handle overflow cases
        long result = 0;
        
        // Calculate the value
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            
            // Check for overflow
            if (flag == '-' && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (flag == '+' && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            
            i++;
        }
        
        if (flag == '-') {
            result = -result;
        }
        
        return (int) result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(atoi("42"));               // Output: 42
        System.out.println(atoi("   -42"));           // Output: -42
        System.out.println(atoi("4193 with words"));  // Output: 4193
        System.out.println(atoi("words and 987"));    // Output: 0
        System.out.println(atoi("-91283472332"));     // Output: -2147483648 (Integer.MIN_VALUE)
        System.out.println(atoi("21474836460"));      // Output: 2147483647 (Integer.MAX_VALUE)
    }
}
