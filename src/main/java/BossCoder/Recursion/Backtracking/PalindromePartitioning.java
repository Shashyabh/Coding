package BossCoder.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
//        Input: s = "aab"
//        Output: [["a","a","b"],["aa","b"]]
        String str="aab";
        List<List<String>>ans=new ArrayList<>();
        f(0,str,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int index,String str,List<String>temp,List<List<String >>ans){
        if(index==str.length()){
            ans.add(new ArrayList<>(temp));
        }

        for (int i = index; i <str.length() ; i++) {
            if (isPalindrome(str.substring(index,i+1))){
                temp.add(str.substring(index,i+1));
                f(i+1,str,temp,ans);
                temp.remove(temp.size()-1);
            }
        }

    }

    public static boolean isPalindrome(String str){
        int s=0;
        int e=str.length()-1;

        while (s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
