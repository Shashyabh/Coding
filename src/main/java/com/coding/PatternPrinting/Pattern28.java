package com.coding.PatternPrinting;

public class Pattern28 {
    public static void main(String[] args) {
        int n=9;

        for(int i=0;i<n;i++){
            if(i<=n/2){
                for(int j=0;j<=n/2-i;j++){
                    System.out.print(" ");
                }

                for(int j=(n/2)-i;j<=i;j++){

                }
                for(int j=(n/2)+i+2;j<n;j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
