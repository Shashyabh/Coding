package com.coding.DP;

public class SubsetSumWithTarget {
    public static void main(String[] args) {
        int []nums={1,1,1};//{1,2,3};
        int k=2;
        System.out.println(f(nums,k,0));
    }
    public static int f(int []nums,int k,int i){
        int n= nums.length;
        if(k==0){
            return 1;
        }
        if(i>=n){
            return 0;
        }
        int take= f(nums,k-nums[i],i+1);
        int notTake=f(nums,k,i+1);
        return take+notTake;
    }

}
