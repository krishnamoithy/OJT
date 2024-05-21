import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age1:");
        int a = scanner.nextInt();

        System.out.println("Enter Your age2: ");
        int b =scanner.nextInt();

        System.out.println("Enter Your age3: ");
        int c =scanner.nextInt();

        int older = Math.max(Math.max(a,b),c);
        int younger = Math.min(Math.min(a,b),c);

        System.out.println("Older age is :"+older);
        System.out.println("Younger age is: "+younger);


    }
}
