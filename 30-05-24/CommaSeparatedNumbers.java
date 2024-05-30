import java.util.Scanner;

public class CommaSeparatedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a comma-separated string of numbers:");
        String input = scanner.nextLine();
        
        
        String[] numberStrings = input.split(",");
        

        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }
        

        System.out.print("The array of numbers is: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        scanner.close();
    }
}
