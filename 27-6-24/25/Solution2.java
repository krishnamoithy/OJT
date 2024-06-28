public class Solution2 {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) return 0;
        return searchInsert(A, target, 0, A.length - 1);
    }

    private int searchInsert(int[] A, int target, int start, int end) {
        if (start > end) {
            return start;
        }
        int mid = start + (end - start) / 2;
        if (A[mid] == target) {
            return mid;
        } else if (A[mid] > target) {
            return searchInsert(A, target, start, mid - 1);
        } else {
            return searchInsert(A, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(arr, 5)); // Output: 2
        System.out.println(solution.searchInsert(arr, 2)); // Output: 1
        System.out.println(solution.searchInsert(arr, 7)); // Output: 4
        System.out.println(solution.searchInsert(arr, 0)); // Output: 0
    }
}
