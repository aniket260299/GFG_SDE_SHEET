//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/
package arrays;

public class Rearrange_array_alternatively {
    public static void rearrange(long arr[], int n) {
        int left = 0;
        int right = n - 1;
        long max = arr[right] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                arr[i] += (arr[right--] % max) * max;
            else
                arr[i] += (arr[left++] % max) * max;
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }
    }
}
