public class subarrays2 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        
        Solution solution = new Solution();
        int result = solution.minSubArrayLen(target, nums);
        
        System.out.println("Minimum length of subarray: " + result);
    }

    static class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int n = nums.length;
            int result = n;
            int i = 0; 
            int sum = 0; 

            for (int j = 0; j < n; j++) {
                sum += nums[j]; 

                while (sum >= s) {
                    result = Math.min(result, j - i + 1);
                    sum -= nums[i++]; 
                }
            }

            return result == n ? 0 : result; 
        }
    }
}
