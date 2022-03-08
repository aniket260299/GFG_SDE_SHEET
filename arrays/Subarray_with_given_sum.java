//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
package arrays;

import java.util.ArrayList;

public class Subarray_with_given_sum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int left = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum - arr[left] >= s) {
                sum -= arr[left++];
            }

            if (sum == s) {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(left + 1);
                al.add(i + 1);
                return al;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        return al;
    }
}
