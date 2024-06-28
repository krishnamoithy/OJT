import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Found duplicate
            }
        }
        
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};
        
        System.out.println(solution.containsDuplicate(nums1)); // Output: false
        System.out.println(solution.containsDuplicate(nums2)); // Output: true
    }
}
