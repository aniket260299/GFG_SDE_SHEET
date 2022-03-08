//https://practice.geeksforgeeks.org/problems/minimum-platforms/0
package arrays;

import java.util.Arrays;

public class Minimum_Platforms {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platform, max, depart;
        platform = max = depart = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, platform);
            int arrival = arr[i];
            while (arrival > dep[depart]) {
                platform--;
                depart++;
            }
            platform++;
        }

        return max;

    }

}
