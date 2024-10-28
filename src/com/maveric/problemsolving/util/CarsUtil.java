package com.maveric.problemsolving.util;

import com.maveric.problemsolving.findsuitablecar.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsUtil {
    public List<Car> getAllCars(){
        List<Car> cars=new ArrayList<>();
        cars.add(new Car(10111,1240000.0,"Tata Nexon","2024",30,4.5));
        cars.add(new Car(10112,1040000.0,"Tata Nexon","2023",40,4.7));
        cars.add(new Car(10113,900000.0,"KIA","2024",35,4.2));
        cars.add(new Car(10114,1540000.0,"Mercedes-Benz","2020",25,4.7));
        cars.add(new Car(10115,700000.0,"Tata Tiago","2019",40,4.1));
        cars.add(new Car(10116,900000.0,"Audi","2022",25,4.6));
        cars.add(new Car(10117,1500000.0,"MG","2021",40,4.0));
        cars.add(new Car(10118,1600000.0,"BMW","2020",30,4.1));
        cars.add(new Car(10119,1500000.0,"Jaguar","2019",35,4.5));
        return cars;
    }

}
