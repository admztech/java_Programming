package Array;

import java.util.*;

public class BuyAndSellStocks {
    public static int BuyAndSellStocks(int prices[]) {
        int maxPro = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxPro = Math.max(maxPro, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] number = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyAndSellStocks(number));

    }
}