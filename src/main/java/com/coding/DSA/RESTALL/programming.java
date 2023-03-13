package com.coding.DSA.RESTALL;

import java.util.ArrayList;

public class programming {

    public static void main(String []args){
        //1+9+25+49=50+34=84
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int odd=arr.stream().filter(x->x%2!=0).reduce(0,(ans,i)->ans+i*i);
        System.out.println(odd);
    }
}
