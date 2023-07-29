package com.coding.Recursion;

public class PowerOfN {
    public static void main(String[] args) {
        System.out.println( f(2.00000,10,1,1));
    }
    public static double f(double x,int n,int i,double total){
        if(i==n+1){
            return total;
        }
        total=total*x;
        return f(x,n,i+1,total);
    }
}
