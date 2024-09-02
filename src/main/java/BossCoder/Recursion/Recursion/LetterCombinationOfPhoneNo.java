package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNo {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        String code[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> ans=new ArrayList<>();

        f(0,"",digits,code,ans);
        return ans;
    }

    public static void f(int index,String str, String digits, String[] code, List<String>ans){
        if(digits.length()==0){
            return;
        }
        if(index==digits.length()){
            ans.add(str);
            return;
        }
        int n=digits.charAt(index)-'0';
        String st=code[n];
        for(int i=0;i<st.length();i++){
            f(index+1,str+st.charAt(i),digits,code,ans);
        }
    }
}
