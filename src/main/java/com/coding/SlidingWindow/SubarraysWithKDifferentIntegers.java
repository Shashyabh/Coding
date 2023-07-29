package com.coding.SlidingWindow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubarraysWithKDifferentIntegers {
    public static void main(String[] args) {
        int []arr={1,2,1,2,3};
        subarraysWithKDistinct(arr,2);
    }
    public static void subarraysWithKDistinct(int[] nums, int k) {
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        while(j< nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            if(map.size()==k){
                sum+=j-i;
            }

            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        System.out.println(sum);
//        int i=0;
//        int j=0;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        List<Integer> temp=new ArrayList<>();
//        List<List<Integer>>ans=new ArrayList<>();
//        while(j< nums.length){
//            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//            temp.add(nums[j]);
//            if (map.size()<k){
//                j++;
//            }
//            if(map.size()==k){      //1,2,1,2,3 //1,2,1,3,4
//                ans.add(new ArrayList<>(temp));
//                j++;
//            }
//            else if(map.size()>k){
//                i++;
//                temp.clear();
//                map.clear();
//                j=i;
//            }
//        }
//        System.out.println(ans);
    }
}
