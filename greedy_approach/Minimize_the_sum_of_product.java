//https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product/0
package greedy_approach;

import java.util.Arrays;

public class Minimize_the_sum_of_product {
    public long minValue(long a[], long b[], long n) {
        Arrays.sort(a);
        Arrays.sort(b);

        long ans = 0;
        int j = (int) (n - 1);
        for (int i = 0; i < n; i++) {
            ans += a[i] * b[j--];
        }

        return ans;
    }
}
