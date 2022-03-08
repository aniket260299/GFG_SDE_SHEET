//https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not/0
package arrays;

import java.util.HashMap;

public class Check_if_two_arrays_are_equal_or_not {
    public static boolean check(long A[], long B[], int N) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long a = A[i];
            long b = B[i];

            if (a == b) continue;

            int val = map.getOrDefault(a, 0) + 1;

            if (val == 0) map.remove(a);
            else map.put(a, val);

            val = map.getOrDefault(b, 0) - 1;

            if (val == 0) map.remove(b);
            else map.put(b, val);

        }
        return map.size() == 0;
    }
}
