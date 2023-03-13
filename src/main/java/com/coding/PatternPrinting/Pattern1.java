package com.coding.PatternPrinting;

public class Pattern1 {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=5-i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
