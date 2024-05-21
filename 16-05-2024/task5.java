import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Exam mark:");
        int mark = scanner.nextInt();
        if(mark <=25){
            System.out.println("Your grade is: F");
        }else if(mark >= 25 && mark <= 50){
            System.out.println("Your Grade is: E");
        }else if(mark >=50 && mark >=60){
            System.out.println("Your Grade is: D");
        }else if(mark >= 60 && mark <= 80){
            System.out.println("Your Grade is: C");
        }else if(mark >=80 && mark <= 90){
            System.out.println("Your Grade is: B");
        }else if(mark >= 90 && mark >=100){
            System.out.println("Your Grade is: A");
        }else{
            System.out.println("Check Your Entered Mark");
        }
        scanner.close();
    }
}
