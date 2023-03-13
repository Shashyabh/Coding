package com.coding.All;

import java.util.Scanner;

public class SortingName {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number how many String you want to sort \t");
        n= sc.nextInt();
        String name[]=new String[n];
        Scanner sc1=new Scanner(System.in);
        System.out.println("\nEnter the Names\t");
        for(int i=0;i<n;i++){
            name[i]=sc1.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(name[i].compareTo(name[j])>0){
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }

        for(String names:name){
            System.out.println(names);
        }
    }
}
