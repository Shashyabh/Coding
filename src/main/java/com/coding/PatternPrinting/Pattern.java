package com.coding.PatternPrinting;

public class Pattern {
    public static void main(String[] args) {

        int n=13;
        for (int i = n/2+1; i >=1 ; i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=2;i<=n/2+1;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//1234567
//123456
//12345
//1234
//123
//12
//1