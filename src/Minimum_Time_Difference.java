import java.util.ArrayList;
import java.util.List;

public class Minimum_Time_Difference {

    public static void main(String[] args) {

        Minimum_Time_Difference solver = new Minimum_Time_Difference();

        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:01");
        timePoints.add("00:11");
        System.out.println(solver.findMinDifference(timePoints));

    }
    public int findMinDifference(List<String> timePoints) {
//        24*60 time points
        final int tableSize = 24 * 60;
        boolean[] points = new boolean[tableSize];
//        fill the time table
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            int index = hour * 60 + minute;
            if (points[index])
                return 0;
            points[index] = true;
        }
        int lastIndex = -1, firstIndex = tableSize + 1;
        int prevIndex = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < tableSize; i++) {
            if (points[i]) {
                firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
//                在第一个索引处不更新preIndex
                if (firstIndex != i)
                    minDiff = Math.min(minDiff, i - prevIndex);
                prevIndex = i;
            }
        }

        return Math.min(minDiff, tableSize - (lastIndex - firstIndex));
    }
}
