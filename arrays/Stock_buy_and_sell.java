//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0
package arrays;

import java.util.ArrayList;

public class Stock_buy_and_sell {
    public void stockBuySell(int[] price, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int buy, sell;
        buy = sell = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] >= price[i - 1]) sell++;
            else {
                if (price[buy] < price[sell])
                    ans.add("(" + buy + " " + sell + ")");
                buy = sell = i;
            }

            if (price[buy] == price[sell]) buy = sell = i;
        }

        if (price[sell] > price[buy]) {
            ans.add("(" + buy + " " + sell + ")");
        }

        if (ans.size() == 0)
            System.out.print("No Profit");
        else {
            for (String str : ans) {
                System.out.print(str + " ");
            }
        }

        System.out.println();
    }
}
