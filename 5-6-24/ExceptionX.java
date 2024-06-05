import java.util.Scanner;

class Program6 {
    int num1, num2;

    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values for num1 and num2:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int res = num1/num2;
        
    //     try {
    //         int res = num1 / num2;
    //         System.out.println("The result is: " + res);
    //     } catch (ArithmeticException e) {
    //         System.out.println("Division by zero is not allowed.");
    //     }
    //     finally{
    //         System.out.println("Finally block executed after Execption");
    //     }
    // }
}
}
public class ExceptionX {
    public static void main(String[] args) {
        Program6 p6 = new Program6();
        p6.calculate();
    }
}
