package com.maveric.problemsolving.findsuitablecar;

import java.util.List;

public class FrontEnd {
    public static void main(String[] args) {
        IcarService service=new CarServiceImpl();
        List<Car> cars=service.getAllCarsBasedOnPriceAndModel(1200000,"2024");
        if (cars.size()==0)
            System.out.println("Oops.... No Cars Available........");
        else{
            cars.stream().forEach(System.out::println);
        }
    }
}
