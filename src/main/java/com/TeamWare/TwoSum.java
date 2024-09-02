package com.TeamWare;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=17;

        int[] sum = twoSum(arr, target);
        System.out.println(sum[0]+" "+sum[1]);

    }
    //Map (2,0) (7,1) (11,2)
    public static int[] twoSum(int []nums,int target){
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int rest=target-nums[i];
            //target=nums[i]+rest
            //rest 2
            if(map.containsKey(rest)){
                ans[0]=map.get(rest);//0
                ans[1]=i;
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}

