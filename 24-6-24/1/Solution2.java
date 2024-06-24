import java.util.Arrays;

public class Solution2 {

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

    public void reverseFirstPart(int[] nums) {
        int mid = nums.length / 2;
        
        // Reverse the first part of the array
        reverse(nums, 0, mid - 1);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        
        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(nums));

        solution.reverseFirstPart(nums);

        System.out.println("Array after reversing the first part: ");
        System.out.println(Arrays.toString(nums));
    }
}
