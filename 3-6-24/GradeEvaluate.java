import java.util.Scanner;

public class GradeEvaluate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scanner.nextInt();
        
        if (score > 90) {
            System.out.println("Your Grade is A");
        } else if (score >= 80) {
            System.out.println("Your Grade is B");
        } else if (score >= 60) {
            System.out.println("Your Grade is C");
        } else if (score >= 50) {
            System.out.println("Your Grade is D");
        } else if (score >= 45) {
            System.out.println("Your Grade is F");
        } else {
            System.out.println("Your Grade is F");
        }
    }
}
