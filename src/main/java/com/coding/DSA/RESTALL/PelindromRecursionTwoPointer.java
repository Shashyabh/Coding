package com.coding.DSA.RESTALL;

public class PelindromRecursionTwoPointer {
    public static void main(String[] args) {

        int n=12321;
        int start=0;
        int end=(int)Math.log10(n)+1;
        pelindrom(n,start,end);
    }

    private static void pelindrom(int n,int start,int end) {
        if(n==0){
            return;
        }

    }
}
