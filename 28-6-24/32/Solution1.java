import java.util.HashMap;
public class Solution1 {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // Update the latest index of nums[i] in the map
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 4, 5};
        
        System.out.println(solution.containsNearbyDuplicate(nums1, 3)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(nums2, 1)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(nums3, 3)); // Output: false
    }
}
