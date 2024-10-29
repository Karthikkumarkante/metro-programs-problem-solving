package com.maveric.problemsolving.profitablestock;

import com.maveric.problemsolving.util.StocksUtil;

import java.util.Map;

public class StocksFrontEnd {
    public static void main(String[] args) {
        StockServiceImpl service=new StockServiceImpl();
        StocksUtil stocksUtil=new StocksUtil();
        Stock res=service.findMaxProfitableStockToSell(stocksUtil.getAllStocks());
        if (res==null)
            System.out.println("No Stock is available");
        else
            System.out.println(res);
    }
}
