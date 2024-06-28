import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int longestConsecutive(int[] num) {
        // If the array is empty, return 0
        if (num == null || num.length == 0) {
            return 0;
        }

        // Use a HashSet to store the elements for O(1) access time
        Set<Integer> set = new HashSet<>();
        for (int e : num) {
            set.add(e);
        }

        int max = 0;
        for (int e : num) {
            // If the element has already been considered in a sequence, skip it
            if (!set.contains(e)) {
                continue;
            }

            // Start checking the sequence containing e
            set.remove(e);
            int count = 1;
            int left = e - 1;
            int right = e + 1;

            // Check for consecutive elements to the left
            while (set.contains(left)) {
                set.remove(left);
                count++;
                left--;
            }

            // Check for consecutive elements to the right
            while (set.contains(right)) {
                set.remove(right);
                count++;
                right++;
            }

            // Update the maximum length found
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}
