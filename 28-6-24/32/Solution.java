import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                int gap = i - lastIndex;
                if (gap <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // Update the latest index of nums[i] in the map
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        
        System.out.println(solution.containsNearbyDuplicate(nums1, 3)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(nums2, 1)); // Output: true
    }
}
