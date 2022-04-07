//https://practice.geeksforgeeks.org/problems/maximize-toys/0
package greedy_approach;

import java.util.Arrays;

public class Maximize_Toys {
    static int toyCount(int N, int K, int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        for (int num : arr) {
            if (K - num >= 0) {
                count++;
                K -= num;
            } else break;
        }
        return count;
    }
}
