public class Solution {
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        
        if ((m + n) % 2 != 0) { // odd
            return (double) findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1);
        } else { // even
            return (findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1) 
                    + findKth(A, B, (m + n) / 2 - 1, 0, m - 1, 0, n - 1)) * 0.5;
        }
    }

    public static int findKth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd) {
        int aLen = aEnd - aStart + 1;
        int bLen = bEnd - bStart + 1;

        // Handle special cases
        if (aLen == 0) {
            return B[bStart + k];
        }
        if (bLen == 0) {
            return A[aStart + k];
        }
        if (k == 0) {
            return Math.min(A[aStart], B[bStart]);
        }

        int aMid = aLen * k / (aLen + bLen); // a's middle count
        int bMid = k - aMid - 1;

        // make aMid and bMid to be array indexes
        aMid = aMid + aStart;
        bMid = bMid + bStart;

        if (A[aMid] > B[bMid]) {
            return findKth(A, B, k - (bMid - bStart + 1), aStart, aMid, bMid + 1, bEnd);
        } else {
            return findKth(A, B, k - (aMid - aStart + 1), aMid + 1, aEnd, bStart, bEnd);
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 8};
        int[] B = {7, 9, 10, 11};
        System.out.println("Median is: " + findMedianSortedArrays(A, B));
    }
}
