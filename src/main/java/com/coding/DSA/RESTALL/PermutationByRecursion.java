package com.coding.DSA.RESTALL;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PermutationByRecursion {

    public static void main(String[] args) {
        String str="abc";

        //permuation("",str);

        ArrayList<String>ans=permutaionArrayList("",str);
        System.out.println(ans);

        //System.out.println(permutationCount("",str));

    }

    public static void permuation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permuation(ch+f+s,up.substring(1));
        }
    }

    public static ArrayList<String> permutaionArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){

            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutaionArrayList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    public static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+permutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
