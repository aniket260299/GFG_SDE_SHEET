//https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0
package searching_and_sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sorting_Elements_of_an_Array_by_Frequency {
    public static void sortElements(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], value);
        }

        int size = map.size();
        int[][] unique = new int[size][2];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            unique[i][0] = entry.getKey();
            unique[i][1] = entry.getValue();
            i++;
        }

        Arrays.sort(unique, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            else return b[1] - a[1];
        });

        int k = 0;
        for (i = 0; i < size; i++) {
            int key = unique[i][0];
            int value = unique[i][1];
            for (int j = 0; j < value; j++) {
                arr[k++] = key;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) arr[j] = in.nextInt();
            sortElements(arr, n);
            for (int j = 0; j < n; j++) System.out.print(arr[j] + " ");
            System.out.println();

        }
        in.close();
    }
}
