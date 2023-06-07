public class Main {
    public static void main(String[] args) {
        IntervalCounter interval = new IntervalCounter();
        int [][] intervals = {{1, 2}, {6, 10}, {11, 15}};
        System.out.println(interval.count(intervals));
    }
}

class IntervalCounter {
    public int count(int[][] intervals) {
        int count = 0;
        for (int[] interval : intervals) {
            int end = interval[1];
            int start = interval[0];
            count += end - start;
        }
        return count;
    }
}