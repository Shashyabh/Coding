package com.coding.DSA.Arrays;

public class WateringPlant {
    public static void main(String[] args) {
        int [] plants = {3,2,4,2,1};//{2,2,3,3};
        int capacity = 6;
        wateringPlant(plants,capacity);
    }

    private static void wateringPlant(int[] plants, int capacity) {
        int count = 0;
        int cap=capacity;
        for (int i=0;i<plants.length;i++){
            if(plants[i]<=cap){
                cap=cap-plants[i];
                count=count+1;
            }
            else{
                count=count+i;
                cap=capacity;
                cap=cap-plants[i];
                count=count+i+1;
            }
        }
        System.out.println(count);
    }
}
