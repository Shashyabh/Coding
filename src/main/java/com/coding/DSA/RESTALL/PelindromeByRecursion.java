package com.coding.DSA.RESTALL;

public class PelindromeByRecursion {

    public static void main(String[] args) {
        int n=1331;
        int a=pelindrom(n);
        if(a==n){
            System.out.println("Yes, It is a pelindrome number");
        }
        else {
            System.out.println("No, It is not a pelindrome number");
        }
    }

    static int sum=0;
    private static int pelindrom(int n) {
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return pelindrom(n/10);
    }
}
