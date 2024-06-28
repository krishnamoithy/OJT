import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        
        int[] temp = new int[triangle.size()];
        Arrays.fill(temp, Integer.MAX_VALUE);
        temp[0] = triangle.get(0).get(0);
        
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    temp[j] = temp[j] + triangle.get(i).get(j);
                } else if (j == i) {
                    temp[j] = temp[j - 1] + triangle.get(i).get(j);
                } else {
                    temp[j] = Math.min(temp[j], temp[j - 1]) + triangle.get(i).get(j);
                }
            }
        }
        
        int minTotal = Integer.MAX_VALUE;
        for (int e : temp) {
            if (e < minTotal) {
                minTotal = e;
            }
        }
        
        return minTotal;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        
        System.out.println(solution.minimumTotal(triangle)); // Output: 11
    }
}
