//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
package arrays;

import java.util.HashMap;

public class Largest_subarray_with_0_sum {
    int maxLen(int arr[], int n) {
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put(0l, -1);
        int maxLength = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (hm.containsKey(sum)) {
                int index = hm.get(sum);
                maxLength = Math.max(maxLength, i - index);
            } else {
                hm.put(sum, i);
            }
        }

        return maxLength;
    }
}
