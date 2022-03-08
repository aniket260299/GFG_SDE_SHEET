//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array/0
package arrays;

public class Kth_Element_of_Two_Sorted_Arrays {
    int[] small, big;
    int size1, size2, K;

    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        if (n > m) {
            big = arr1;
            small = arr2;
        } else {
            big = arr2;
            small = arr1;
        }
        size1 = small.length;
        size2 = big.length;
        K = k;
        int end = Math.min(K, size1);
        return findKth(0, end);
    }

    public int findKth(int start, int end) {
        if (start > end) return 0;

        int cut1 = start + (end - start) / 2;
        int cut2 = K - cut1;
        if (cut2 > size2) return findKth(cut1 + 1, end);

        int left1, left2, right1, right2;

        left1 = left2 = Integer.MIN_VALUE;
        if (cut1 - 1 >= 0) left1 = small[cut1 - 1];
        if (cut2 - 1 >= 0) left2 = big[cut2 - 1];

        right1 = right2 = Integer.MAX_VALUE;
        if (cut1 < size1) right1 = small[cut1];
        if (cut2 < size2) right2 = big[cut2];

        if (left1 > right2) return findKth(start, cut1 - 1);
        if (left2 > right1) return findKth(cut1 + 1, end);

        return Math.max(left1, left2);
    }
}
