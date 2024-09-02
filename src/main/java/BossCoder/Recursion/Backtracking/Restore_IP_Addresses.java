package BossCoder.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {
    public static void main(String[] args) {
//        Input: s = "25525511135"
//        Output: ["255.255.11.135","255.255.111.35"]
        String str="25525511135";
        List<String>ans=new ArrayList<>();
        f(0,0,str,"",ans);
        System.out.println(ans);
    }
    public static void f(int i,int part, String str, String s, List<String>ans){
        if (i==str.length() && part==4){
            ans.add(s.substring(0,s.length()-1));
        }
        if (i+1<=str.length()){
            f(i+1,part+1,str,s+str.charAt(i)+".",ans);
        }
        if(i+2<=str.length() && isValid(str.substring(i,i+2))){
            f(i+2,part+1,str,s+str.substring(i,i+2)+".",ans);
        }
        if(i+3<=str.length() && isValid(str.substring(i,i+3))){
            f(i+3,part+1,str,s+str.substring(i,i+3)+".",ans);
        }
    }

    private static boolean isValid(String substring) {
        if(substring.charAt(0)=='0'){
            return false;
        }
        int num=Integer.parseInt(substring);
        return num<=255;
    }


}
