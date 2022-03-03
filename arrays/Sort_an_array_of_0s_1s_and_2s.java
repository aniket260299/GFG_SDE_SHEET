//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/
package arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void sort012(int a[], int n) {
        int[] count = new int[3];

        for (int num : a) {
            count[num]++;
        }

        int i = 0;
        for (int j = i; j < count[0]; j++) {
            a[j] = 0;
        }

        i = count[0];
        for (int j = i; j < count[0] + count[1]; j++) {
            a[j] = 1;
        }

        i += count[1];
        for (int j = i; j < n; j++) {
            a[j] = 2;
        }
    }
}
