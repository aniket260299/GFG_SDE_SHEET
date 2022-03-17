//https://practice.geeksforgeeks.org/problems/binary-search/1
package searching_and_sorting;

public class Binary_Search {
    int binarysearch(int arr[], int n, int k) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) return mid;

            if (arr[mid] > k) end = mid - 1;
            else start = mid + 1;

        }
        return -1;
    }
}
