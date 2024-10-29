package com.maveric.problemsolving.balancedstring;

import java.util.Stack;

public class BalancedStringService {


    /**
     * Validates if the input string has balanced parentheses, brackets, and braces.
     *
     * A string is considered balanced if every opening character has a corresponding
     * closing character in the correct order.
     *
     * @param input the string to validate.
     * @return true if the string is balanced; false otherwise.
     * @throws Exception if the input string is empty or blank.
     *
     *    Best Case Scenario Time Complexity : O(n)
     *    Worst Case Scenario Time Complexity : O(n)
     *    Average Case Scenario Time Complexity : O(n)
     *    Auxialary Space Complexity : O(n)
     */

    public boolean validateBalancedStringOrNot(String input) throws Exception {
        Stack<Character> charactersStack=new Stack<>();
        if (input.isEmpty() || input.isBlank()){
            throw new Exception("String is Empty");
        }
        for (Character ch:input.toCharArray()){
            if (ch=='(' || ch=='{' || ch=='[') {
                charactersStack.push(ch);
            }
            if (ch==')' || ch=='}' || ch==']'){
                if (charactersStack.isEmpty()) {
                    return false;
                }
                char stackTopChar=charactersStack.pop();
                if (!isMatched(stackTopChar,ch)) {
                    return false;
                }
            }
        }
        return charactersStack.isEmpty();
    }

    /**
     * Checks if the given opening and closing characters match as a valid pair.
     *
     * This method verifies whether a specified opening character ('(', '{', '[')
     * corresponds to its respective closing character ( ')', '}', ']').
     *
     * @param open the opening character to validate.
     * @param close the closing character to validate.
     * @return true if the opening and closing characters form a matching pair;
     *         false otherwise.
     */
    private boolean isMatched(char open,char close){
        return (open== '(' && close==')' ||open== '{' && close=='}' || open== '[' && close==']');
    }
}
