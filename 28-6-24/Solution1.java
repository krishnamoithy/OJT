public class Solution1 {
    import java.util.TreeSet;
import java.util.SortedSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) {
            return false;
        }
        
        TreeSet<Long> set = new TreeSet<>();
        
        for (int j = 0; j < nums.length; j++) {
            long leftBoundary = (long) nums[j] - t;
            long rightBoundary = (long) nums[j] + t + 1;
            
            // Using subSet to find if there's any number in the range [leftBoundary, rightBoundary)
            SortedSet<Long> subSet = set.subSet(leftBoundary, rightBoundary);
            
            if (!subSet.isEmpty()) {
                return true;
            }
            
            set.add((long) nums[j]);
            
            // Maintain the sliding window of size k
            if (j >= k) {
                set.remove((long) nums[j - k]);
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

}
