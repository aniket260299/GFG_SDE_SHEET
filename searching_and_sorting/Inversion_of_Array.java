//https://practice.geeksforgeeks.org/problems/inversion-of-array/0/
package searching_and_sorting;

public class Inversion_of_Array {
    private static long count;

    static long inversionCount(long arr[], long N) {
        count = 0;
        int r = (int) (N - 1);
        mergeSort(arr, 0, r);
        return count;
    }

    static void merge(long arr[], int l, int m, int r) {
        long[] sorted = new long[r - l + 1];
        int k = 0;
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) sorted[k++] = arr[i++];
            else {
                sorted[k++] = arr[j++];
                count += m - i + 1;
            }
        }

        while (i <= m) sorted[k++] = arr[i++];

        while (j <= r) sorted[k++] = arr[j++];

        k = 0;
        for (i = l; i <= r; i++) arr[i] = sorted[k++];
    }

    static void mergeSort(long arr[], int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }
}
