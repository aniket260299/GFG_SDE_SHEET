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
        int i = low;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) swap(arr, i++, j);
        }
        swap(arr, i, high);
        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
