import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        
        System.out.println("Enter your annual income:");
        double income = scanner.nextDouble();
        
        if (age < 18) {
            System.out.println("You are not eligible for loan.");
        } else if (age >= 18 && age <= 25) {
            if (income >= 2500) {
                System.out.println("You are eligible for  small loan.");
            } else {
                System.out.println("You are not eligible for  loan.");
            }
        } else if (age >= 26 && age <= 35) {
            if (income >= 50000) {
                System.out.println("You are eligible for  medium loan.");
            } else {
                System.out.println("You are not eligible for  loan.");
            }
        } else {
            System.out.println("You are not eligible for  loan based on the provided criteria.");
        }
    }
}
