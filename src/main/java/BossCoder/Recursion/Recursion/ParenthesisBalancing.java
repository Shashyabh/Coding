package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ParenthesisBalancing {
    public static void main(String[] args) {
        List<String>ans =new ArrayList<>();
        f(3,0,0,"",ans);
        System.out.println(ans);
    }

    public static void f(int n, int open, int close, String str, List<String>ans){
        if(open==n && close==n){
            ans.add(str);
            return;
        }
        if(open<n){
            f(n,open+1,close,str+"(",ans);
        }
        if (close<open){
            f(n,open,close+1,str+")",ans);
        }
    }
}
