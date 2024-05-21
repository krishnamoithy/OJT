
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your service years: ");
        int x = scanner.nextInt();
        System.out.println("Enter your salery per month:");
        int y = scanner.nextInt();
        int z = (int) (0.05*y);
        if(x >=5){
            System.out.println("Your current salery :"+ y);
            System.out.println("bonus:" + (z+y));
        }else{
            System.out.println("You not able to get bonus");
        }

    }
}
