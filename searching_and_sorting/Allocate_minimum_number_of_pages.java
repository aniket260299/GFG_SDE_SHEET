//https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/
package searching_and_sorting;

public class Allocate_minimum_number_of_pages {
    public static int findPages(int[] A, int N, int M) {
        int max = A[0];
        int sum = max;
        for (int i = 1; i < N; i++) {
            sum += A[i];
            max = Math.max(A[i], max);
        }
        return binarySearch(A, M, max, sum, -1);
    }

    public static int binarySearch(int[] arr, int k, int lb, int ub, int ans) {
        if (lb > ub) return ans;
        int mid = lb + (ub - lb) / 2;
        int current = findMaxPage(arr, k, mid);
        if (current != -1) {
            ans = current;
            return binarySearch(arr, k, lb, current - 1, ans);
        } else return binarySearch(arr, k, mid + 1, ub, ans);

    }

    public static int findMaxPage(int[] arr, int k, int ub) {
        int sum, max;
        max = sum = 0;
        int student = 1;
        for (int pages : arr) {
            if (pages > ub) return -1;
            else if (sum + pages <= ub) sum += pages;
            else {
                max = Math.max(max, sum);
                sum = pages;
                student++;
                if (student > k) return -1;
            }
        }
        return Math.max(max, sum);
    }
}
