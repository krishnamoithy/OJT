public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 638211532;
        long LargestPrimeFactor = findLargestPrimeFactor(number);
        System.out.println("The largest prime factor of"+ number + "is :"+LargestPrimeFactor);
    }
    public static long findLargestPrimeFactor(long number) {
        long largestfactor = -1;

        while (number % 2 == 0) {
            largestfactor = 2;
            number /= 2;
        }

        for(int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) { 
                largestfactor = i;
                number /= i;
            }
        }
         if (number > 2) {
            largestfactor = number;
         }
         return largestfactor;
    }
}
