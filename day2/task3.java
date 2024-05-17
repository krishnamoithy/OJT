
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost of product:");
        int cost = scanner.nextInt();
        System.out.println("Enter the Quantity of product:");
        int Quantity=scanner.nextInt();
        int total =(cost*Quantity);

        if(total >= 1000){
            int totalcost=(int) (0.1*total);
            int discount= (int) (total-totalcost);
            System.out.println("Your Total Cost: "+ discount);
        }else{
            System.out.println("Your total cost:"+total);
        }
        scanner.close();
    }
}
