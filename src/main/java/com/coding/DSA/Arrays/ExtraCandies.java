package com.coding.DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ExtraCandies {
    public static void main(String[] args) {
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        extra(candies,extraCandies);
    }

    private static void extra(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>();
        int key=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>key){
                key=candies[i];
            }
        }

        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]+extraCandies>=key){
                arr.add(true);
            }
            else {
                arr.add(false);
            }
        }

        System.out.println(arr);
    }
}
