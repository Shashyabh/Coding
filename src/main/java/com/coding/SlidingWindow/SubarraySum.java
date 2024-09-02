package com.coding.SlidingWindow;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int []nums={1,2,1,2,1};
        int k=3;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {

        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int res=sum-k;
            if(map.containsKey(res)){
                count+=map.get(res);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
