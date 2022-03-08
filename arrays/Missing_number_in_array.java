//https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
package arrays;

public class Missing_number_in_array {
    int MissingNumber(int array[], int n) {
        int result = 0;
        int i = 1;
        for (int num : array) {
            result ^= num;
            result ^= i++;
        }

        result = result ^ n;
        return result;
    }
}
