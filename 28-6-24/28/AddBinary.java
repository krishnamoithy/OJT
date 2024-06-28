public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0)
            return b;
        if (b == null || b.length() == 0)
            return a;
        
        int pa = a.length() - 1;
        int pb = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while (pa >= 0 || pb >= 0) {
            int va = 0;
            int vb = 0;
            if (pa >= 0) {
                va = a.charAt(pa) == '0' ? 0 : 1;
                pa--;
            }
            if (pb >= 0) {
                vb = b.charAt(pb) == '0' ? 0 : 1;
                pb--;
            }
            int sum = va + vb + carry;
            if (sum >= 2) {
                sb.append(sum - 2);
                carry = 1;
            } else {
                carry = 0;
                sb.append(sum);
            }
        }
        
        if (carry == 1) {
            sb.append("1");
        }
        
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        AddBinary solution = new AddBinary();
        System.out.println(solution.addBinary("11", "1")); // Output: "100"
    }
}
