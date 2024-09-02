package com.coding.Practice;

public class NumberPelindrome {

    public static void main(String[] args) {
        int n=123;
        int temp=n;

        int sum=f(n);

        if(temp==sum){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static int f(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=sum*10+last;
            n=n/10;
        }
        return sum;
    }
}
