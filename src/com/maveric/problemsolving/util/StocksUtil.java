package com.maveric.problemsolving.util;

import com.maveric.problemsolving.profitablestock.Stock;

import java.util.ArrayList;
import java.util.List;

public class StocksUtil {
    public List<Stock> getAllStocks(){
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("stck001", "TATA ", 70000, 20, 80000));
        stocks.add(new Stock("stck002", "TESLA ", 50000, 15, 70000));
        stocks.add(new Stock("stck003", "Infosys ",60000, 10, 80000));
        stocks.add(new Stock("stck004", "Adani ", 20000, 5, 5000));
        stocks.add(new Stock("stck005", "Reliance", 30000, 25, 40000));
        stocks.add(new Stock("stck006", "Wipro", 40000, 23, 90000));
        return stocks;
    }
}
