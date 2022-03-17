//https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
package searching_and_sorting;

public class Kth_smallest_element {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int index = partition(arr, l, r);
        if (index + 1 == k) return arr[index];
        else if (index + 1 > k) return kthSmallest(arr, l, index - 1, k);
        else return kthSmallest(arr, index + 1, r, k);
    }

    public static int partition(int arr[], int low, int high) {
        int index = low;
        int pivot = arr[high];

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;

        return index;
    }
}
