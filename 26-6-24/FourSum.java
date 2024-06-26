import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> hashSet = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int l = nums.length - 1;
                
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        
                        if (!hashSet.contains(temp)) {
                            hashSet.add(temp);
                            result.add(temp);
                        }
                        
                        k++;
                        l--;
                  
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
        
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }
          
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        ArrayList<ArrayList<Integer>> result = fourSum(nums, target);
        
        for (ArrayList<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
