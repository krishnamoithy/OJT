public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Sum of a and b: " + mathOps.add(15, 15));
        System.out.println("Sum of a, b, and c: " + mathOps.add(10, 15, 20));
        System.out.println("Sum of a, b, c, and d: " + mathOps.add(10, 15, 20, 25));
    }
}
