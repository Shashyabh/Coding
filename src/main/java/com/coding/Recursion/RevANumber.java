package com.coding.Recursion;

public class RevANumber {
    static int sum=0;
    public static void main(String[] args) {
        System.out.println(f(365));
    }
    public static int f(int num){
        if(num<=0){
            return 0;
        }
        sum=sum*10+num%10;
        f(num/10);
        return sum;
    }
}
