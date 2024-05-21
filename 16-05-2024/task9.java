import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();
        

        double Percentage = calculatePercentage(classesHeld, classesAttended);

        System.out.println("Percentage of classes attended: " + Percentage + "%");
        
        System.out.print("Do you have a medical cause? (Y/N): ");
        char medical = scanner.next().charAt(0);
        

        if (isAllowedToSitInExam(Percentage, medical)) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }
        
        scanner.close();
    }
    

    public static double calculatePercentage(int classesHeld, int classesAttended) {
        return ((double) classesAttended / classesHeld) * 100;
    }

    public static boolean isAllowedToSitInExam(double Percentage, char medical) {
        if (Percentage >= 75.0) {
            return true;
        } else if (medical == 'Y' || medical == 'y') {
            return true;
        } else {
            return false;
        }
    }
}
