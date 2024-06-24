import java.util.*;

public class Solution {

    // Approach 1: Sorting
    public int findKthLargest_Sorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // Approach 2: Quickselect Algorithm
    public int findKthLargest_Quickselect(int[] nums, int k) {
        if (k < 1 || nums == null) {
            return 0;
        }
        return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
    }

    private int getKth(int k, int[] nums, int start, int end) {
        int pivot = nums[end];
        int left = start;
        int right = end;

        while (true) {
            while (nums[left] < pivot && left < right) {
                left++;
            }
            while (nums[right] >= pivot && right > left) {
                right--;
            }
            if (left == right) {
                break;
            }
            swap(nums, left, right);
        }

        swap(nums, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return getKth(k, nums, start, left - 1);
        } else {
            return getKth(k, nums, left + 1, end);
        }
    }

    private void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

    // Approach 3: Min-Heap (PriorityQueue)
    public int findKthLargest_Heap(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll(); // Remove the smallest element if the size exceeds k
            }
        }

        return pq.peek(); // Peek the top element which is the k-th largest
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1, 5, 6, 4};

        // Test each approach
        System.out.println("Kth Largest using Sorting: " + solution.findKthLargest_Sorting(nums, 2));
        System.out.println("Kth Largest using Quickselect: " + solution.findKthLargest_Quickselect(nums, 2));
        System.out.println("Kth Largest using Min-Heap: " + solution.findKthLargest_Heap(nums, 2));
    }
}
