package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>>ans=new ArrayList<>();
        f(nums,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int nums[],int start,List<Integer> temp,List<List<Integer>> ans){
        ans.add(new ArrayList(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            f(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
