package com.coding.DSA.RESTALL;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

            System.out.println(c);
        }
    }
}
