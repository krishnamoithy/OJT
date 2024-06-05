import java.util.Scanner;

public class exceptionx2 {
    public static void employee(int years) {
        if (years > 12) {
            throw new ArithmeticException("We have only 12 years experience employee");
        } else if (years > 6) {
            System.out.println("You are eligible to get 10,000");
        } else if (years >= 2 && years <= 5) {
            System.out.println("You are eligible to get 5,000");
        } else {
            System.out.println("Your working experience is not eligible for increment");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the total years of experience:");
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        employee(years);
}
}