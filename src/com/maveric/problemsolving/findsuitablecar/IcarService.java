package com.maveric.problemsolving.findsuitablecar;

import java.util.List;

public interface IcarService {
    List<Car> getAllCarsBasedOnPriceAndModel(double price,String model);
}
