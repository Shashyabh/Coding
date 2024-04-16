package com.coding.BinarySearch;


public class MinNoOfDaysToMake_m_Bouquests {

    public static void main(String[] args) {
        System.out.println(minDays(new int[]{7,7,7,7,12,7,7},2, 3));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int s=1;
        int e=12;

        int ans=0;
        if(bloomDay.length<m*k){
            return -1;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            int tot=find(bloomDay,k,mid);
            if(tot>=m){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }

    public static int find(int nums[],int k,int mid){
        int total=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
            }
            else{
                if(count>=k){
                    total++;
                }
                count=0;
            }
        }
        if (count >= k) {
            total++;
        }
        System.out.println("mid: " + mid + ", total: " + total);
        return total;
    }
}