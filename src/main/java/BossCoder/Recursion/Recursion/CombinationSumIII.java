package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
//        Input: k = 3, n = 9
//        Output: [[1,2,6],[1,3,5],[2,3,4]]
//        Explanation:
//        1 + 2 + 6 = 9
//        1 + 3 + 5 = 9
//        2 + 3 + 4 = 9
        int k=3;
        int n=9;

        List<List<Integer>> ans =new ArrayList<>();
        f(1,k,n,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int index,int k,int n,List<Integer> temp ,List<List<Integer>>ans){
        if(temp.size()==k && n==0){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=index;i<=9;i++){
            temp.add(i);
            f(i+1,k,n-i,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
