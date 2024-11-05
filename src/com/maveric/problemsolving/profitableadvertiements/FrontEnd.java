package com.maveric.problemsolving.profitableadvertiements;

import com.maveric.problemsolving.util.AdvertisementsUtil;

import java.util.List;

public class FrontEnd {
    public static void main(String[] args) {
        AdvertisementService service=new AdvertisementService();
        List<Advertisement> maximumProfitableAdvertisements = service.findMaximumProfitableAdvertisements(60);
        maximumProfitableAdvertisements.forEach(System.out::println);
    }
}
