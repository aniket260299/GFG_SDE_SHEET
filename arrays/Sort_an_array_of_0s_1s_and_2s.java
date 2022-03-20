//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/
package arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void sort012(int arr[], int n) {
        int low, mid, high;
        low = mid = 0;
        high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) swap(arr, mid++, low++);

            else if (arr[mid] == 1) mid++;

            else swap(arr, mid, high--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
