public class Solution1 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        
        int mid = nums.length / 2;
        int[] part1 = new int[mid];
        int[] part2 = new int[nums.length - mid];

        // Copy first part
        System.arraycopy(nums, 0, part1, 0, mid);

        // Copy second part
        System.arraycopy(nums, mid, part2, 0, nums.length - mid);

        // Rotate first part
        rotatePart(part1, k);

        // Rotate second part
        rotatePart(part2, k);

        // Combine parts back
        System.arraycopy(part1, 0, nums, 0, mid);
        System.arraycopy(part2, 0, nums, mid, nums.length - mid);
    }

    private void rotatePart(int[] part, int k) {
        int len = part.length;
        if (k > len) {
            k = k % len;
        }

        reverse(part, 0, len - 1);
        reverse(part, 0, k - 1);
        reverse(part, k, len - 1);
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
        Solution1 solution = new Solution1();
        
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

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
