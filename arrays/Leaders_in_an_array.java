//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1/
package arrays;

import java.util.*;

public class Leaders_in_an_array {
    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int lastGreater = arr[n - 1];
        answer.add(lastGreater);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= lastGreater) {
                lastGreater = arr[i];
                answer.add(lastGreater);
            }
        }
        Collections.reverse(answer);

        return answer;
    }
}
