package com.maveric.problemsolving.findBestCar;

import java.util.List;

public interface IcarService {
    List<Car> getAllCarsBasedOnPriceAndModel(double price,String model);
}
