//https://practice.geeksforgeeks.org/problems/trapping-rain-water/0
package arrays;

public class Trapping_Rain_Water {
    static long trappingWater(int arr[], int n) {
        int left, right, leftMax, rightMax;
        left = leftMax = rightMax = 0;
        right = n - 1;
        long water = 0;

        while (left <= right) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(arr[left], leftMax);
                water += leftMax - arr[left++];
            } else {
                rightMax = Math.max(arr[right], rightMax);
                water += rightMax - arr[right--];
            }
        }

        return water;
    }
}
