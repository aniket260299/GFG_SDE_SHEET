//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array/0
package arrays;

public class Kth_Element_of_Two_Sorted_Arrays {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int end = Math.min(k, n);
        return kthElementHelper(arr1, arr2, k, 0, end);
    }

    public long kthElementHelper(int arr1[], int arr2[], int k, int start, int end) {
        int cut1 = start + (end - start) / 2;
        int cut2 = k - cut1;
        if (cut2 > arr2.length) return kthElementHelper(arr1, arr2, k, cut1 + 1, end);

        int lt1, lt2, rt1, rt2;
        lt1 = lt2 = Integer.MIN_VALUE;
        rt1 = rt2 = Integer.MAX_VALUE;

        if (cut1 - 1 >= 0) lt1 = arr1[cut1 - 1];
        if (cut2 - 1 >= 0) lt2 = arr2[cut2 - 1];
        if (cut1 < arr1.length) rt1 = arr1[cut1];
        if (cut2 < arr2.length) rt2 = arr2[cut2];

        if (lt1 > rt2) return kthElementHelper(arr1, arr2, k, start, cut1 - 1);
        if (lt2 > rt1) return kthElementHelper(arr1, arr2, k, cut1 + 1, end);

        return Math.max(lt1, lt2);
    }
}
