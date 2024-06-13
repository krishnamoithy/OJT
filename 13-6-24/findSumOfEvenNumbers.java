public class findSumOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = findSumOfEvenNumbers(numbers);
        System.out.println("The sum of even numbers in the array is:" + sum);
    }
    public static int findSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if(number % 2 == 0) {
                sum += number;
            } 
        }
        return sum;
    }
}
