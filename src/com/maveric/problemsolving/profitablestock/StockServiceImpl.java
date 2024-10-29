package com.maveric.problemsolving.profitablestock;

import com.maveric.problemsolving.util.StocksUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StockServiceImpl implements IstockService{

    /**
     * Finds the stock with the maximum profit from a list of stocks.
     *
     * This method sorts the provided list of stocks based on their expected profit
     * (calculated as Total Expected Profit per Month minus Total Value)
     * in descending order and returns the stock with the highest profit.
     *
     * @param stocks a list of Stock objects to evaluate.
     * @return the Stock object that has the maximum profit.
     *
     * @throws NoSuchElementException if the list of stocks is empty.
     *
     *  Best Case Scenario Time Complexity : O(nlogn)
     *  Worst Case Scenario Time Complexity : O(nlogn)
     *  Average Case Scenario Time Complexity : O(nlogn)
     *
     *  Auxialary Space Complexity : O(n)
     *
     */




    @Override
    public Stock findMaxProfitableStockToSell(List<Stock> stocks) {
        if (stocks == null || stocks.isEmpty()) {
            throw new NoSuchElementException("The list of stocks is empty.");
        }

        Stock stock = stocks.stream().sorted((s1, s2) -> {
                    double stock1Profit = s1.getTotalExpectedProfitPerMonth() - s1.getTotalValue();
                    double stock2Profit = s2.getTotalExpectedProfitPerMonth() - s2.getTotalValue();
                    return (int) (stock2Profit - stock1Profit);
                }).collect(Collectors.toList())
                .get(0);
        return stock;
    }
}
