package com.maveric.problemsolving.stringcombinations;

import java.util.List;

public class FrontEnd {
    public static void main(String[] args) {
        StringCombinationsService service=new StringCombinationsService();
        List<String> combinations = service.generatePermutations("ABCDE");
        System.out.println("Starts and Ends with Vowels:");
        combinations.stream().forEach(System.out::println);

    }
}
