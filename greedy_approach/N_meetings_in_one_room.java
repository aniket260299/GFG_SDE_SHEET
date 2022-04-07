//https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room/0
package greedy_approach;

import java.util.Arrays;

public class N_meetings_in_one_room {
    public static int maxMeetings(int start[], int end[], int n) {
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        int count = 1;
        int last = meetings[0][1];
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > last) {
                count++;
                last = meetings[i][1];
            }
        }

        return count;
    }
}
