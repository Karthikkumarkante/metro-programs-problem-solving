package com.maveric.problemsolving.profitablestock;

import java.util.HashMap;
import java.util.Map;

public class StockServiceImpl implements IstockService{

    /**
     * Finds the maximum profitable stock to buy and sell from an array of stock prices.
     *
     * This method iterates through the array of stock prices, tracking the lowest price
     * encountered so far (best stock to buy) and calculating the maximum profit possible
     * by selling at the current price. The result is returned as a map containing the best
     * stock price to buy and the maximum profit achievable.
     *
     * @param stocks an array of integers representing the stock prices over time.
     * @return a map with the key being the best stock price to buy and the value being the maximum profit.
     *
     *  Best case scenario time complexity : O(n)
     *  Worst case scenario time complexity : O(n)
     *  Average case scenario time complexity : O(n)
     *
     *  Auxialary space Complexity : O(1)
     *
     */


    @Override
    public Map<Integer, Integer> findMaxProfitableStockToBuyAndSell(int[] stocks) {
        int maxProfit=0,bestStockToBuy=stocks[0];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=1;i<stocks.length;i++){
            if (stocks[i]>bestStockToBuy){
                maxProfit=((stocks[i]-bestStockToBuy)>maxProfit?(stocks[i]-bestStockToBuy):maxProfit);
            }
            bestStockToBuy=(bestStockToBuy<stocks[i]?bestStockToBuy:stocks[i]);
        }
        map.put(bestStockToBuy,maxProfit);
        return map;
    }
}
