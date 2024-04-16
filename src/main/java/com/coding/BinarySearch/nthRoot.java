package com.coding.BinarySearch;

public class nthRoot {
    public static void main(String[] args) {
        System.out.println(NthRoot(3,27));
    }
    public static int NthRoot(int n, int m) {
            // Write your code here.
            int s=0;
            int e=m;

            while(s<=e){
                int mid=s+(e-s)/2;

                int sum=(int) Math.pow(mid, n);
                if(sum==m){
                    return mid;
                }
                else if(sum<m){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
        }
}
