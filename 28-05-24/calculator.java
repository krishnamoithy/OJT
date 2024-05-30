public class calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

   
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
    
        double num1 = 100.0;
        double num2 = 50.10;

        System.out.println("Add: " + calculator.add(num1, num2));          
        System.out.println("Sub: " + calculator.subtract(num1, num2));   
        System.out.println("Mul: " + calculator.multiply(num1, num2));
        System.out.println("Div: " + calculator.divide(num1, num2));

}
}