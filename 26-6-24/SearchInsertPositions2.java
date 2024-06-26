public class SearchInsertPositions2 {

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
            if (nums == null || nums.length == 0) return 0;
            return searchInsert(nums, target, 0, nums.length - 1);
        }

        private int searchInsert(int[] nums, int target, int start, int end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                if (start < mid) {
                    return searchInsert(nums, target, start, mid - 1);
                } else {
                    return start;
                }
            } else {
                if (end > mid) {
                    return searchInsert(nums, target, mid + 1, end);
                } else {
                    return end + 1;
                }
            }
        }
    }
}
