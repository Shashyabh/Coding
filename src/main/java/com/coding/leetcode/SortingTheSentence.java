package com.coding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingTheSentence {
    public static void main(String[] args) {
        String str= "is2 sentence4 a3 This1";

        String[] arr=str.split(" ");
        String[] arr2=new String[arr.length];
        StringBuffer sb =new StringBuffer();

        for(int i=0;i<arr.length;i++){
            int k=arr[i].charAt(arr[i].length()-1)-'0';
            arr2[k-1]=arr[i].substring(0,(arr[i].length()-1));
        }

        for(int j=0;j<arr2.length;j++){
            sb.append(arr2[j]+" ");
        }
        System.out.println(sb);
    }
}
