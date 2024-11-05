package com.maveric.problemsolving.profitableadvertiements;

import com.maveric.problemsolving.util.AdvertisementsUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdvertisementService {
    private AdvertisementsUtil advertisementsUtil=new AdvertisementsUtil();


    /**
     * Finds the most profitable set of advertisements that can fit within a given height.
     * This method sorts the advertisements by height in descending order
     * Then selects that can fit within the available remaining height.
     *
     * @param height The total height available for placing advertisements.
     * @return A list of the most profitable advertisements that fit within the given height.
     *
     *      Best Case Scenario Time Complexity : O(n log n)
     *      Worst Case Scenario Time Complexity : O(n log n)
     *      Average Case Scenario Time Complexity : O(n log n)
     *
     *      Auxialary Space Complexity : O(n)
     *
     */
    public List<Advertisement> findMaximumProfitableAdvertisements(int height){
        List<Advertisement> bestProfitableAdvertisements=new ArrayList<>();
        List<Advertisement> sortedAdvertisements = advertisementsUtil.getAllAdvertisements().stream()
                .sorted((ad1, ad2) -> ad2.getHeight() - ad1.getHeight())
                .collect(Collectors.toList());
        int remainingHeight=height;
        for (Advertisement ad:sortedAdvertisements){
            if (ad.getHeight() <= remainingHeight) {
                bestProfitableAdvertisements.add(ad);
                remainingHeight -= ad.getHeight();
            }
        }
        return bestProfitableAdvertisements;
    }
}
