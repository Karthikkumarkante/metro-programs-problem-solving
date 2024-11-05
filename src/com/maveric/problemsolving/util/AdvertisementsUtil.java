package com.maveric.problemsolving.util;

import com.maveric.problemsolving.profitableadvertiements.Advertisement;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementsUtil {

    public List<Advertisement> getAllAdvertisements(){
        List<Advertisement> advertisements=new ArrayList<>();
        advertisements.add(new Advertisement("Ad001", 50, 2, "Zomato", "Buy two get one coke free"));
        advertisements.add(new Advertisement("Ad002",50, 15, "TAG ", "flat 20% discount on all orders"));
        advertisements.add(new Advertisement("Ad003", 50, 25, "Dell ", "Free delivery For all product"));
        advertisements.add(new Advertisement("Ad004", 50, 20, "OnePlus", "flat 10% off on HDFC credit card"));
        advertisements.add(new Advertisement("Ad005",50, 30, "Roadster ", "Buy One Get One"));
        advertisements.add(new Advertisement("Ad006", 50, 50, "Zara ", "Free delivery"));
        return advertisements;
    }
}
