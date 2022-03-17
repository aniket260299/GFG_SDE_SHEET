//https://practice.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays/0
package searching_and_sorting;

public class Sum_of_Middle_Elements_of_two_sorted_arrays {
    int findMidSum(int[] arr1, int[] arr2, int n) {
        return findMidSum(arr1, arr2, n, 0, n);
    }


    int findMidSum(int[] arr1, int[] arr2, int n, int start, int end) {
        int cut1 = start + (end - start) / 2;
        int cut2 = n - cut1;
        if (cut2 > n) return findMidSum(arr1, arr2, n, cut1 + 1, end);

        int lt1, lt2, rt1, rt2;
        lt1 = lt2 = Integer.MIN_VALUE;
        rt1 = rt2 = Integer.MAX_VALUE;

        if (cut1 - 1 >= 0) lt1 = arr1[cut1 - 1];
        if (cut2 - 1 >= 0) lt2 = arr2[cut2 - 1];
        if (cut1 < n) rt1 = arr1[cut1];
        if (cut2 < n) rt2 = arr2[cut2];

        if (lt1 > rt2) return findMidSum(arr1, arr2, n, start, cut1 - 1);
        if (lt2 > rt1) return findMidSum(arr1, arr2, n, cut1 + 1, end);

        return Math.max(lt1, lt2) + Math.min(rt1, rt2);
    }
}
