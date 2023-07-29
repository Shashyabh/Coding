package com.Ikshita;

import java.util.Scanner;

public class OperatorsAndExpressions {
    public static void main(String args[]){
       // int a = 2;
       // int b = 4;
        //int c = 1;
       // float x = (b*b)-4*a*c/(2*a);
        //
        //System.out.println(x);
       // float a = 2;
       // float b = 4;
        //float c = 1;
        //float x = (b*b)-(4*a*c/(2*a));//16-(8/4)=16-2=14
       // System.out.println(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        float a = sc.nextFloat();
        System.out.println("enter b");
        float b = sc.nextFloat();
        System.out.println("enter c");
        float c = sc.nextFloat();
        float x = (b*b)-4*a*c/(2*a);
        System.out.println(x);

    }
}
