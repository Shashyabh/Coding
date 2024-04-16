package com.coding.BinarySearch;

public class SQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",f(27,3));
        System.out.println();
        double result = f(5,2);
        System.out.printf("%.4f", result);
    }

    public static double f(int n,int m){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        double eps=1e-6;
        double s=0;
        double e=n;
        double ans=1;
        while (e-s>eps){
            double mid=s+(e-s)/2;
            if(Math.pow(mid, m)==n){
                return mid;
            } else if (Math.pow(mid, m)>n) {
                ans=mid;
                e=mid;
            }
            else {
                ans=mid;
                s=mid;
            }
        }


        return ans;
    }
}
