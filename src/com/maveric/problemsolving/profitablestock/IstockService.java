package com.maveric.problemsolving.profitablestock;

import java.util.Map;

public interface IstockService {
    Map<Integer,Integer> findMaxProfitableStockToBuyAndSell(int[] stocks);
}
