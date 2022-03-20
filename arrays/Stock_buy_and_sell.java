//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0
package arrays;

import java.util.ArrayList;

public class Stock_buy_and_sell {
    ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();
        int buy = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                if (i - 1 != buy) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(buy);
                    ans.add(i - 1);
                    finalAns.add(ans);
                }
                buy = i;
            }
        }

        if (arr[buy] < arr[n - 1]) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(buy);
            ans.add(n - 1);
            finalAns.add(ans);
        }

        return finalAns;
    }
}
