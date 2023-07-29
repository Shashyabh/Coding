package com.Ikshita;

import java.util.Scanner;

public class SumOfTwoNoByKeyboard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num");
        int num1=sc.nextInt();
        System.out.println("Enter the sec num");
        int num2=sc.nextInt();
        int sum=num1 + num2;
        //System.out.println("Sum of two num ");
        System.out.println("Sum of two num "+sum);
    }
}
