//https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
package arrays;

public class Kadanes_Algorithm {
    long maxSubarraySum(int arr[], int n) {
        long currentSum = arr[0];
        long max = arr[0];

        for (int i = 1; i < n; i++) {
            if ((currentSum + arr[i]) < arr[i])
                currentSum = arr[i];
            else
                currentSum += arr[i];

            max = Math.max(max, currentSum);
        }
        return max;
    }
}
