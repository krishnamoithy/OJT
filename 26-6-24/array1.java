public class array1 {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;  // Index for the last element in the initialized part of A
        int j = n - 1;  // Index for the last element in B
        int k = m + n - 1;  // Index for the last position in A's total length

        // Merge B into A starting from the end
        while (k >= 0) {
            if (j < 0 || (i >= 0 && A[i] > B[j])) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
    }

    public static void main(String[] args) {
        array1 solution = new array1();
        int[] A = {1, 3, 5, 0, 0, 0};  // Example input array A with extra space
        int[] B = {2, 4, 6};           // Example input array B
        int m = 3;  // Number of initialized elements in A
        int n = 3;  // Number of elements in B

        solution.merge(A, m, B, n);

        // Print the merged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
