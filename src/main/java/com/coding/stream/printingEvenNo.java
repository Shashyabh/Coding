package com.coding.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class printingEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(5);

        List<Integer> list=arr.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list);

        List<Integer>list1=arr.stream().filter(x->x>3).collect(Collectors.toList());
        System.out.println(list1);
        int list2=arr.stream().map(x->x%2==0?x*x:0).reduce(0,(sum,i)->sum+i);
        System.out.println(list2);

    }

}
