package com.maveric.problemsolving.balancedstring;

public class BalancedStringFrontEnd {
    public static void main(String[] args) throws Exception {
        BalancedStringService stringService = new BalancedStringService();
        boolean res1=stringService.validateBalancedStringOrNot("([ ( ) { } ( { { } } ) ] )");
        boolean res2=stringService.validateBalancedStringOrNot("( [ (  ]  ) )");
        System.out.println("([ ( ) { } ( { { } } ) ] ) is "+(res1?"Balanced String":"Not Balanced String"));
        System.out.println("( [ (  ]  ) ) is "+(res2?"Balanced String":"Not Balanced String"));
    }
}
