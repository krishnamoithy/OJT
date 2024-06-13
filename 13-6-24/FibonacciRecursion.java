public class FibonacciRecursion{
    public static void main(String[] args) {
        int n =10;
        System.out.println("First "+ n +"numbers of the Fibonacci series:");
        for(int i = 0; i < n; i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}