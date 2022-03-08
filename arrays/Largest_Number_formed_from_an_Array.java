//https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0
package arrays;

import java.util.Arrays;

public class Largest_Number_formed_from_an_Array {
    String printLargest(String[] arr) {
        Arrays.sort(arr, (a, b) -> {
            return (a + b).compareTo(b + a);
        });

        StringBuilder ans = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--)
            ans.append(arr[i]);
        return ans.toString();
    }
}
