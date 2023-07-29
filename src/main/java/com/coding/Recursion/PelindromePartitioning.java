package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PelindromePartitioning {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        f(ans,new ArrayList<>(),s,0);
        return ans;
    }
    public static void f(List<List<String>>ans,List<String>temp, String s, int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                f(ans,temp,s,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end){
        // A simple palindromic function start from 0 go till end.
        // And basically keep on checking till they don't cross.
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
