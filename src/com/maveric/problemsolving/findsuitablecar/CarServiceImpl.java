package com.maveric.problemsolving.findsuitablecar;

import com.maveric.problemsolving.util.CarsUtil;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements IcarService{

    CarsUtil carsUtil=new CarsUtil();


    /**
     *
     *  Retrives a list of cars that match the specified price and model
     *
     * @param price maximum price of the cars customer want to see
     * @param model the model of the car to be retrived.
     * @return list of cars that have the price less than or equals to specified price
     *              and match the specified model.
     *
     *
     *  Best Case Time Complexity: O(n)
     *  Worst Case Time Complexity: O(n)
     *  Average Case Time Complexity: O(n)
     *  Auxiliary Space Complexity: O(m), m=number of filtered cars
     */

    @Override
    public List<Car> getAllCarsBasedOnPriceAndModel(double price, String model) {
       return carsUtil.getAllCars()
                .stream().filter(car -> car.getPrice()<=price && car.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }
}
