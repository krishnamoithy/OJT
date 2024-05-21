import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter the first value: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int y = scanner.nextInt();
        
        if (x < y) {
            System.out.println("First value is less than the second value");
        } else if (x == y) {
            System.out.println("First and second values are equal");
        } else {
            System.out.println("Second value is less than the first value");
        }
        
        scanner.close();
    }
}
