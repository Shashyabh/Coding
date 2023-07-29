package com.coding.GreedyAlgorithm;

import java.util.Arrays;

public class CandyDistribution {
    public static void main(String[] args) {
        int []arr={12,4,3,11,34,34,1,67};
        System.out.println(candy(arr));

    }
    public static int candy(int[] ratings) {
        int n=ratings.length;

        int[]left=new int[n];
        Arrays.fill(left,1);

        int[]right=new int[n];
        Arrays.fill(right,1);

        int i=0;
        int j=1;
        while(j<n){
            if(ratings[j]>ratings[i]){
                left[j]=left[i]+1;
            }
            i++;
            j++;
        }
        i=n-1;
        j=n-2;
        while(j>=0){
            if(ratings[j]>ratings[i]){
                right[j]=right[i]+1;
            }
            i--;
            j--;
        }

        int ans=0;

        for(int k=0;k<n;k++){
            ans=ans+Math.max(left[k],right[k]);
        }
        return ans;
    }
}
