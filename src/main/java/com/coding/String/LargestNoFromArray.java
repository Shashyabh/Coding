package com.coding.String;

import java.util.Arrays;
import java.util.Stack;

public class LargestNoFromArray {
    public static void main(String[] args) {
        int [] arr = {3,30,34,5,9}; //"9534330"
        largestNumber(arr);
    }

    private static void largestNumber(int[] arr) {
        String s=Arrays.toString(arr);
        char temp='0';
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i)>s.charAt(j)){
//                    temp=s.charAt(i);
//                    s.charAt(i)=s.charAt(j);
//                    s.charAt(j)=temp;
                }
            }
        }

    }
}
