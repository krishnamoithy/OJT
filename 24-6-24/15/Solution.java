import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Sort array
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < num.length - 2; i++) {
            // Skip duplicates for the first element
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int target = -num[i];
                int left = i + 1;
                int right = num.length - 1;
                
                while (left < right) {
                    int sum = num[left] + num[right];
                    if (sum == target) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(num[i]);
                        triplet.add(num[left]);
                        triplet.add(num[right]);
                        result.add(triplet);
                        
                        // Skip duplicates for the second element
                        while (left < right && num[left] == num[left + 1]) left++;
                        // Skip duplicates for the third element
                        while (left < right && num[right] == num[right - 1]) right--;
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }
}
