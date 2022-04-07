//https://practice.geeksforgeeks.org/problems/activity-selection/0
package greedy_approach;

import java.util.Arrays;

public class Activity_Selection {
    public static int activitySelection(int start[], int end[], int n) {
        int[][] activity = new int[n][2];
        for (int i = 0; i < n; i++) {
            activity[i][0] = start[i];
            activity[i][1] = end[i];
        }

        Arrays.sort(activity, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        int count = 1;
        int last = activity[0][1];
        for (int i = 1; i < n; i++) {
            if (activity[i][0] > last) {
                count++;
                last = activity[i][1];
            }
        }

        return count;
    }
}
