//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
package greedy_approach;

import java.util.Arrays;

public class Minimize_the_heights_II {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int small = arr[0] + k;
        int large = arr[n - 1] - k;
        int ans = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(small, arr[i + 1] - k);
            int max = Math.max(large, arr[i] + k);
            if (min < 0) continue;
            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}
