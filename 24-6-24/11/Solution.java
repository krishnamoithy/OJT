import java.util.ArrayList;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();

        // Traverse through all intervals
        for (Interval interval : intervals) {
            // If current interval ends before newInterval starts, add it to result
            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (interval.start > newInterval.end) { // If newInterval ends before current interval starts, add newInterval and then current interval
                result.add(newInterval);
                newInterval = interval;
            } else { // Merge overlapping intervals
                newInterval = new Interval(Math.min(interval.start, newInterval.start),
                                           Math.max(interval.end, newInterval.end));
            }
        }

        // Add the last newInterval
        result.add(newInterval);

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage to test insert method
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));

        Interval newInterval = new Interval(2, 5);

        ArrayList<Interval> mergedIntervals = solution.insert(intervals, newInterval);

        // Print the merged intervals
        for (Interval interval : mergedIntervals) {
            System.out.println(interval.start + " -> " + interval.end);
        }
    }
}
