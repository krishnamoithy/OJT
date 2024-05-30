import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        int nextPrime = N + 1;
        
        while (true) {
            if (isPrime(nextPrime)) {
                System.out.println("The first prime number greater than " + N + " is: " + nextPrime);
                break;
            }
            nextPrime++;
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
