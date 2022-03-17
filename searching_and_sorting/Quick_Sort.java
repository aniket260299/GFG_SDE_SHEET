//https://practice.geeksforgeeks.org/problems/quick-sort/1
package searching_and_sorting;

public class Quick_Sort {
    static void quickSort(int arr[], int low, int high) {
        if (low >= high) return;
        int index = partition(arr, low, high);
        quickSort(arr, low, index - 1);
        quickSort(arr, index + 1, high);

    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low && arr[j] > pivot) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
