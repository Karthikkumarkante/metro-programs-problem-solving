package com.maveric.problemsolving.profitablestock;

import java.util.Map;

public class StocksFrontEnd {
    public static void main(String[] args) {
        StockServiceImpl service=new StockServiceImpl();
        Map<Integer, Integer> res=service.findMaxProfitableStockToBuyAndSell(new int[]{7,1,5,3,6,4});
        res.entrySet().forEach(System.out::println);

    }
}
