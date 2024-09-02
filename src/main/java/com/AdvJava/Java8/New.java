package com.AdvJava.Java8;


import java.util.ArrayList;
import java.util.List;

public class New {

    public static void main(String[] args) {
        String str="aacilovejava";
        int [] arr=new int[26];
        String [] words=str.split("");

        //[2,0,0,0,0,0...........                ]
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=ch-'a';
            arr[n]=arr[n]+1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println((char)('a'+i)+" "+arr[i]);
            }
        }

        String strr="abc+cde+enf";
        String[] wordss=strr.split("\\+");

        for (String st:wordss){
            System.out.println(st);
        }
        List<Integer> list=new ArrayList<>();
        list.add(1);
        //{()}
    }
}
