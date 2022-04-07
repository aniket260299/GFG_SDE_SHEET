//https://practice.geeksforgeeks.org/problems/coin-piles/0
package greedy_approach;

import java.util.Arrays;

public class Choose_and_Swap {
    String chooseandswap(String A) {
        int n = A.length();
        char[] arr = A.toCharArray();
        int[] firstIdx = new int[26];
        Arrays.fill(firstIdx, -1);

        for (int i = 0; i < n; i++) {
            int idx = arr[i] - 'a';
            if (firstIdx[idx] == -1)
                firstIdx[idx] = i;
        }

        for (int i = 0; i < n; i++) {
            int idx = arr[i] - 'a';
            for (int j = 0; j < idx; j++) {
                if (firstIdx[idx] < firstIdx[j]) {
                    char ch = (char) (j + 'a');
                    replace(arr, arr[i], ch);
                    return new String(arr);
                }
            }
        }

        return A;
    }

    private void replace(char[] arr, char ch1, char ch2) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch1) arr[i] = ch2;
            else if (arr[i] == ch2) arr[i] = ch1;
        }
    }
}
