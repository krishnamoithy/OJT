import java.util.Scanner;

class MyCustomExecption extends Exception{
    public MyCustomExecption(String msg){
        super(msg);
    }
}
public class exceptionx1 {
    public static void accept(int marks) throws MyCustomExecption{
        if(marks >100 || marks!=0){
            throw new MyCustomExecption("total marks cannot exceed 100");
        }
        else if(marks>=70){
            System.out.println("Excellent");
        }
        else if(marks>=0 && marks<=69){
            System.out.println("Good");
        }
        else{
            System.out.println("Poor / faill");
        }
    }
    public static void main(String[] args) throws MyCustomExecption {
        System.out.println("Enter the total marks:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        accept(marks);
    }
}
