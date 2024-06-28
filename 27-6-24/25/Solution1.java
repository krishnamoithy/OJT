public class Solution1 {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) return 0;
        for (int i = 0; i < A.length; i++) {
            if (target <= A[i]) {
                return i;
            }
        }
        return A.length;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] arr = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(arr, 5)); // Output: 2
        System.out.println(solution.searchInsert(arr, 2)); // Output: 1
        System.out.println(solution.searchInsert(arr, 7)); // Output: 4
        System.out.println(solution.searchInsert(arr, 0)); // Output: 0
    }
}
