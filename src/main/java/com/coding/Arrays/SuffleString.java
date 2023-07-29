package com.coding.Arrays;

public class SuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
                       //0,1,2,3,4,5,6,7--->i
        suffle(s,indices);
    }

    private static void suffle(String s, int[] indices) {
//        String str="";
//        for (int i = 0; i <indices.length ; i++) {
//            str=str+s.charAt(indices[i]);
//        }
        String str1="";
        String[] str=new String[s.length()];

        for (int i = 0; i <indices.length ; i++) {
            str[indices[i]]=s.valueOf(s.charAt(i));
        }
        for(String x:str){
            str1=str1+x;
        }
            System.out.println(str1);
        }

}
