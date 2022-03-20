//https://practice.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal/0
package arrays;

import java.util.HashSet;

public class Swapping_pairs_make_sum_equal {
    long findSwapValues(long A[], int n, long B[], int m) {
        long sumA = 0;
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(A[i]);
            sumA += A[i];
        }

        long sumB = 0;
        for (int i = 0; i < m; i++) {
            sumB += B[i];
        }

        if ((sumA - sumB) % 2 != 0) return -1;

        long target = (sumA - sumB) / 2;

        for (int i = 0; i < m; i++) {
            if (set.contains(target + B[i])) return 1;
        }

        return -1;
    }
}
