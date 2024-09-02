package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_II {
    public static void main(String[] args) {
//        Given an integer array nums that may contain duplicates, return all possible subsets
//        The solution set must not contain duplicate subsets. Return the solution in any order.
//        Input: nums = [1,2,2]
//        Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

        int nums[]={1,2,2};
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        f(nums,0,new ArrayList<>(),ans);
        System.out.println(ans);

    }

    public static void f(int nums[], int index, List<Integer> temp,List<List<Integer>>ans){
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            f(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
