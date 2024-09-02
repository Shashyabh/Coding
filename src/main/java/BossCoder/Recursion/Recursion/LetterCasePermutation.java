package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static void main(String[] args) {
//        Input: s = "a1b2"
//        Output: ["a1b2","a1B2","A1b2","A1B2"]
        String str[]=letterCasePermutation("3z4");
        for(String s:str){
            System.out.println(s);
        }
        //System.out.println(letterCasePermutation("a1b2"));
    }

    public static String[] letterCasePermutation(String s) {
        String str[]=new String[s.length()];
        List<String>ans=new ArrayList<>();
        f(0,s,"",ans);
        System.out.println(ans);
        for (int i=0;i< ans.size();i++){
            str[i]= ans.get(i);
        }
        return str;
    }

    public static void f(int index,String s, String str,List<String> ans){
        if(str.length()==s.length()){
            ans.add(str);
            return;
        }

        for(int i=index;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                f(i+1,s, str+Character.toUpperCase(s.charAt(i)),ans);
                f(i+1,s, str+Character.toLowerCase(s.charAt(i)),ans);
            }
            else{
                f(i+1,s, str+s.charAt(i),ans);
            }
        }
    }
}
