import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) {
            return false;
        }
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            
            // Check if there exists an element in the set within the range [current - t, current + t]
            Integer floor = set.floor(current);
            Integer ceiling = set.ceiling(current);
            
            if ((floor != null && current <= floor + t) ||
                (ceiling != null && ceiling <= current + t)) {
                return true;
            }
            
            // Add current element to the set
            set.add(current);
            
            // Remove the element which is out of the sliding window of size k
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 5, 9, 1, 5, 9};
        
        System.out.println(solution.containsNearbyAlmostDuplicate(nums1, 3, 0)); // Output: true
        System.out.println(solution.containsNearbyAlmostDuplicate(nums2, 1, 2)); // Output: true
        System.out.println(solution.containsNearbyAlmostDuplicate(nums3, 2, 3)); // Output: false
    }
}
