package com.maveric.problemsolving.stringcombinations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCombinationsService {


    /**
     * Generates all the possible permutations of the given string by inserting
     * characters at every possible position for each new character as it traverses the string.
     *
     * This implementation computes the permutations iteratively, starting from the first character,
     * and progressively builds all possible permutations by adding one character at a time.
     * It then filters the permutations based on whether they start and end with a vowel.
     *
     * @param str The input string whose permutations are to be generated.
     * @return A list of all valid permutations where each permutation starts and ends with a vowel.
     *
     *
     *  Best Case Scenario Time Complexity : O(1)
     *  Worst Case Scenario Time Complexity : O(n!)
     *  Average Case Scenario Time Complexity : O(n!)
     *
     *  Auxialary Space Complexity : O(n!)
     *
     *
     */
    public static List<String> generatePermutations(String str) {
        List<String> results = new ArrayList<>();
        int count=0;
        if (str == null || str.length() == 0) {
            return results;
        }

        results.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            List<String> newPermutations = new ArrayList<>();
            for (String perm : results) {
                for (int j = 0; j <= perm.length(); j++) {
                    String newPerm = perm.substring(0, j) + currentChar + perm.substring(j);
                        newPermutations.add(newPerm);
                    count++;
                }
            }
            results = newPermutations;
        }
        return results.stream().filter(StringCombinationsService::checkWheatherStartsAndEndsWithVowelOrNot)
                .collect(Collectors.toList());
    }

    private static boolean checkWheatherStartsAndEndsWithVowelOrNot(String newPerm) {
        char startChar=newPerm.charAt(0);
        char endChar=newPerm.charAt(newPerm.length()-1);
        if (startChar=='a'||startChar=='A'||startChar=='e'||startChar=='E'||startChar=='i'||startChar=='I'
                || startChar=='o'||startChar=='O'||startChar=='u'||startChar=='U'){
            if (endChar=='a'||endChar=='A'||endChar=='e'||endChar=='E'||endChar=='i'||endChar=='I'
                    || endChar=='o'||endChar=='O'||endChar=='u'||endChar=='U'){
                return true;
            }
        }
        return false;
    }


}
