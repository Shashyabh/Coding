package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        f(0,nums,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int index,int[]nums,List<Integer>temp,List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            f(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
//1
