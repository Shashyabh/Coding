package BossCoder.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Letter_Tile_Possibilities {
    public static void main(String[] args) {
        //"A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
        String str="AAB";
        Set<String> ans=new HashSet<>();
        boolean vis[]=new boolean[str.length()];
        f("",str,ans,vis);
        System.out.println(ans.size()-1);

    }
    public static void f(String s, String str, Set<String>ans,boolean vis[]){
        ans.add(s);
        for(int i=0;i<str.length();i++){
            if(!vis[i]){
                vis[i]=true;
                f(s+str.charAt(i),str,ans,vis);
                vis[i]=false;
            }
        }
    }
}
