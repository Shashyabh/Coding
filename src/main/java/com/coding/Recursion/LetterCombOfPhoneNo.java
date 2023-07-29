package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombOfPhoneNo {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        String[] codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        f(ans,codes,digits,"",0);
        return ans;
    }
    public static void f(List<String> ans,String[] codes,String digits, String str, int i){
        if(digits.length()==0){
            return;
        }
        if(i==digits.length()){
            ans.add(str);
            return;
        }
        //System.out.print(codes[ch-'0']); // digits="23";
        int n=digits.charAt(i)-'0';
        String currStr=codes[n];
        for(int ind=0;ind<currStr.length();ind++){
            str=str+currStr.charAt(ind);
            f(ans,codes,digits,str,i+1);
            str=str.substring(0,str.length()-1);
        }
    }
}
