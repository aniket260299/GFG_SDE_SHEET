//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1/
package arrays;

import java.util.Arrays;

public class Equilibrium_point {
    public static int equilibriumPoint(long arr[], int n) {
        long totalSum = 0;
        for (long num : arr)
            totalSum += num;

        int currSum = 0;
        for (int i = 1; i <= n; i++) {
            if (totalSum - currSum - arr[i - 1] == currSum)
                return i;
            currSum += arr[i - 1];
        }
        return -1;
    }
}
