public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }
        
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        
        return null; // If no such pair is found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage to test twoSum method
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(numbers, target);

        // Print the indices of the two numbers
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + ":");
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers in the array add up to " + target);
        }
    }
}
