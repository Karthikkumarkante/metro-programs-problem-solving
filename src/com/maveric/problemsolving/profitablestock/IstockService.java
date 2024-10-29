package com.maveric.problemsolving.profitablestock;

import java.util.List;
import java.util.Map;

public interface IstockService {
    Stock findMaxProfitableStockToSell(List<Stock> stocks);
}
