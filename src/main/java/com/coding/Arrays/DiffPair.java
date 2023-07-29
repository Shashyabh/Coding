package com.coding.Arrays;

import java.util.HashSet;

public class DiffPair {
    public static void main(String[] args) {
        int []arr={1,2,5,10,6,7};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i]+5;
            int y=arr[i]-5;
            if(set.contains(x)){
                System.out.println(x+" "+arr[i]);
            }
            else if(set.contains(y)){
                System.out.println(y+" "+arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
    }
}
