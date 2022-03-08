//https://practice.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal/0
package arrays;

import java.util.HashSet;

public class Swapping_pairs_make_sum_equal {
    long findSwapValues(long A[], int n, long B[], int m) {
        long sumA, sumB;
        sumA = sumB = 0;

        for (long num : A) sumA += num;
        for (long num : B) sumB += num;

        if ((sumA - sumB) % 2 != 0) return -1;

        long[] big, small;
        long bigSum, smallSum;

        if (sumA > sumB) {
            big = A;
            small = B;
            bigSum = sumA;
            smallSum = sumB;
        } else {
            big = B;
            small = A;
            bigSum = sumB;
            smallSum = sumA;
        }

        HashSet<Long> set = new HashSet<>();
        for (long num : big) set.add(num);

        long target = (bigSum - smallSum) / 2;

        for (long num : small)
            if (set.contains(target + num))
                return 1;

        return -1;
    }
}
