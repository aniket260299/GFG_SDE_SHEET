//https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array/0
package searching_and_sorting;

public class Search_in_a_Rotated_Array {
    int search(int arr[], int left, int right, int key) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;
        if (arr[mid] == key) return mid;

        if (arr[mid] >= arr[left]) {
            if (arr[left] <= key && arr[mid] > key)
                return search(arr, left, mid - 1, key);
            else
                return search(arr, mid + 1, right, key);
        } else {
            if (arr[mid] <= key && arr[right] >= key)
                return search(arr, mid + 1, right, key);
            else
                return search(arr, left, mid - 1, key);
        }
    }
}
