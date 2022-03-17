//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/
package searching_and_sorting;

public class Merge_two_sorted_arrays {
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int gap = (n + m + 1) / 2;
        while (gap >= 1) {
            for (int i = 0; i + gap < m + n; i++) {
                if (i < n && i + gap < n) {
                    if (arr1[i] > arr1[i + gap]) {
                        swap(arr1, arr1, i, i + gap);
                    }
                } else if (i < n && i + gap >= n) {
                    if (arr1[i] > arr2[i + gap - n]) {
                        swap(arr1, arr2, i, i + gap - n);
                    }
                } else {
                    if (arr2[i - n] > arr2[i + gap - n]) {
                        swap(arr2, arr2, i - n, i + gap - n);
                    }
                }
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    public static void swap(long[] arr1, long[] arr2, int i, int j) {
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
