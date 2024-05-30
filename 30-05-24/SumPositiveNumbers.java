import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter integers to sum. Enter zero to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if (number < 0) {
                continue;
            }
            
            sum += number;
        }

        System.out.println("The sum of the positive numbers is: " + sum);
        
        scanner.close();
    }
}
