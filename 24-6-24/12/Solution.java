import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement) + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(numbers[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage to test twoSum method
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] indices = solution.twoSum(numbers, target);
        
        // Print the indices of the two numbers
        System.out.println("Indices of the two numbers that add up to " + target + ":");
        System.out.println(indices[0] + ", " + indices[1]);
    }
}
