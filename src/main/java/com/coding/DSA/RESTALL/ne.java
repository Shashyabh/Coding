package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ne {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5,6};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        List<Integer> sublist=list.subList(0,list.size());
        System.out.println(sublist.get(0));
        System.out.println(list);
        System.out.println(list.size());

    }
}
