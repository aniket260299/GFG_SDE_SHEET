//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0
package arrays;

import java.util.ArrayList;

public class Reverse_array_in_groups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        reverseInGroupsHelper(arr, 0, k, n);
    }

    void reverseInGroupsHelper(ArrayList<Integer> arr, int left, int k, int n) {
        if (left >= n) return;
        if (left + k >= n) {
            reverse(arr, left, n - 1);
        } else {
            reverse(arr, left, left + k - 1);
            reverseInGroupsHelper(arr, left + k, k, n);
        }

    }

    void reverse(ArrayList<Integer> arr, int left, int right) {
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
    }
}
