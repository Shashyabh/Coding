package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
//        Input: candidates = [2,3,6,7], target = 7
//        Output: [[2,2,3],[7]]

        int nums[]={2,3,6,7};
        int target=7;
        List<List<Integer>>ans=new ArrayList<>();
        f(0,target,nums,new ArrayList<>(),ans);
        System.out.println(ans);

    }
    public static void f(int index,int sum,int nums[],List<Integer>temp,List<List<Integer>>ans){
        if(sum<0){
            return;
        }
        if(sum==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            f(i,sum-nums[i],nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
