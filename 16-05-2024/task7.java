import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int Value = cValue(number);
        
        System.out.println("The absolute value is: " + Value);
        
        scanner.close();
    }

    public static int cValue(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }
}
