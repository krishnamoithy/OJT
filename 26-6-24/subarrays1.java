public class subarrays1 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {
            sum += nums[end];

            while (sum >= s) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        subarrays1 solution = new subarrays1();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        System.out.println(solution.minSubArrayLen(s, nums)); 
    }
}
