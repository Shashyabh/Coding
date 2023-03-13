package com.coding.DSA.RESTALL;

import java.util.ArrayList;

public class SubStringByRec {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subseq("",str));
    }

    private static ArrayList<String> subseq(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String >left=subseq(p+ch,up.substring(1));
        ArrayList<String >right=subseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
