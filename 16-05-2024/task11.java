import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a character: ");
        char x = scanner.next().charAt(0);

        if (x >= 'a' && x <= 'z') {
            System.out.println("The entered character is lowercase.");
        } else if (x >= 'A' && x <= 'Z') {
            System.out.println("The entered character is uppercase.");
        } else {
            System.out.println("it is not an alphabet letter.");
        }
        
        scanner.close();
    }
}
