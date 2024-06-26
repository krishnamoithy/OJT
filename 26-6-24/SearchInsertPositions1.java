public class SearchInsertPositions1 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;
        
        Solution solution = new Solution();
        System.out.println("Index for target 5: " + solution.searchInsert(nums, target1));
        System.out.println("Index for target 2: " + solution.searchInsert(nums, target2));
        System.out.println("Index for target 7: " + solution.searchInsert(nums, target3));
        System.out.println("Index for target 0: " + solution.searchInsert(nums, target4));
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            if (nums == null) return 0;
            if (target <= nums[0]) return 0;

            for (int i = 0; i < nums.length - 1; i++) {
                if (target > nums[i] && target <= nums[i + 1]) {
                    return i + 1;
                }
            }
            
            return nums.length;
        }
    }
}
