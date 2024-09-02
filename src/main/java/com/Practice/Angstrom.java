package com.Practice;

public class Angstrom {
    public static void main(String[] args) {
        int n=123;
        int sum=f(n);
        System.out.println(sum);
        if(sum==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static int f(int n){

        int sum=0;
        while (n>0){
            int last=n%10;
//            sum=sum+last*last*last;
            sum=sum+(int)Math.pow(last,3);
            n=n/10;
        }

        return sum;
    }
}
