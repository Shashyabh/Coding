package com.coding.DSA.RESTALL;

public class FirstOccurenceRecursion {
    public static void main(String[] args) {
        String up = "butsad", find = "sad";
        System.out.println(occurence(up,find,0));;
    }

    public static int occurence(String up, String find,int index){
        if(up.isEmpty()){
            return -1;
        }
        if(!up.startsWith(find)) {
            return occurence(up.substring(1), find, index + 1);
        }
         return index;
    }


}
