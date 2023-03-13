package com.coding.leetcode;

import java.util.HashSet;

public class mountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5,3,1};
        int target=6;
        int cm=0;
        int om= arr.length-1;

        for( int i=0;i< arr.length;i++){
            if (arr[i]==target) {
                cm = i;
                if (cm < om) {
                    om = cm;
                }
            }
        }
        System.out.println(om);
    }
}
