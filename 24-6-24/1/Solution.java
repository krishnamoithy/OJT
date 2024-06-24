public class Solution {
    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        solution.rotate(nums, k);

        System.out.println("\nArray after rotation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
