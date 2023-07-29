package com.coding.DP;

public class SuccessfulPairs_LeetCode_2300 {
    public static void main(String[] args) {
        int []spells = {5,1,3};
        int []potions = {1,2,3,4,5};
        int success=7;
        int ans[]=f(spells,potions,success);
        for(int a:ans){
            System.out.println(a);
        }
    }

    public static int[] f(int []spells,int[]potions,int success){
        int [] arr=new int[spells.length];
        int k=0;
        for (int i = 0; i < spells.length ; i++) {
            int count=0;
            for (int j = 0; j < potions.length; j++) {
                if(spells[i]*potions[j]>=success){
                    count++;
                }
            }
            arr[k]=count;
            k++;
        }
        return arr;
    }
}
