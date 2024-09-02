package BossCoder.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
//        Input: n = 4, k = 2
//        Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
        List<List<Integer>>ans=new ArrayList<>();
        int n=4;
        int k=2;
        f(1,n,k,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int index, int n, int k, List<Integer> temp,List<List<Integer>>ans){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=index;i<=n;i++){
            temp.add(i);
            f(i+1,n,k,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
