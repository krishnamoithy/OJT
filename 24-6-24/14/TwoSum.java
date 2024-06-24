import java.util.HashMap;

public class TwoSum {
    private HashMap<Integer, Integer> elements = new HashMap<>();

    public void add(int number) {
        elements.put(number, elements.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (int i : elements.keySet()) {
            int target = value - i;
            if (elements.containsKey(target)) {
                // Check if the same number is used twice and it's only available once
                if (i == target && elements.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        
        // Example usage
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);
        
        System.out.println("Is there a pair that sums up to 4? " + twoSum.find(4)); // Should print true
        System.out.println("Is there a pair that sums up to 7? " + twoSum.find(7)); // Should print false
    }
}
