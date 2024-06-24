import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1)
            return intervals;

        Collections.sort(intervals, new IntervalComparator());
        ArrayList<Interval> result = new ArrayList<>();
        Interval prev = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (prev.end >= curr.start) {
                // merged case
                Interval merged = new Interval(prev.start, Math.max(prev.end, curr.end));
                prev = merged;
            } else {
                result.add(prev);
                prev = curr;
            }
        }

        result.add(prev);
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage to test merge method
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        ArrayList<Interval> mergedIntervals = solution.merge(intervals);

        // Print the merged intervals
        for (Interval interval : mergedIntervals) {
            System.out.println(interval.start + " -> " + interval.end);
        }
    }
}

class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
    }
}
