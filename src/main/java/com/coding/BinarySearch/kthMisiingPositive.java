package com.coding.BinarySearch;

public class kthMisiingPositive {
    public static void main(String[] args) {
        int nums[]={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(nums,k));
    }
    public static int findKthPositive(int[]nums, int k) {
        k=k-nums[0]+1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-2){
                k--;
            }
            if(k==0){
                return nums[i];
            }
        }
        return -1;
    }
}
