//https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0
package searching_and_sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sorting_Elements_of_an_Array_by_Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = in.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int[][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                arr[j][0] = in.nextInt();
                int val = map.getOrDefault(arr[j][0], 0) + 1;
                map.put(arr[j][0], val);
            }


            int count = 0;
            int[][] array = new int[map.size()][2];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                array[count][0] = entry.getKey();
                array[count][1] = entry.getValue();
                count++;
            }

            Arrays.sort(array, (a, b) -> {
                if (a[1] == b[1]) return a[0] - b[0];
                else return b[1] - a[1];
            });

            for (int j = 0; j < count; j++) {
                int k = map.get(array[j][0]);
                for (int p = 0; p < k; p++)
                    System.out.print(array[j][0] + " ");
            }

            System.out.println();
        }
    }
}
