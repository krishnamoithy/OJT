import java.util.Arrays;

public class Solution4 {

    // Function to reverse part of an array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateAndReverse(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        
        // Reverse the first part of the array
        reverse(nums, 0, nums.length - k - 1);
        
        // Reverse the second part of the array
        reverse(nums, nums.length - k, nums.length - 1);
        
        // Reverse the whole array
        reverse(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(nums));

        solution.rotateAndReverse(nums, k);

        System.out.println("Array after rotating and reversing: ");
        System.out.println(Arrays.toString(nums));
    }
}
