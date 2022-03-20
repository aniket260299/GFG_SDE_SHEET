//https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
package searching_and_sorting;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallest_element {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i <= r; i++) {
            if (pq.peek() > arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }
}
