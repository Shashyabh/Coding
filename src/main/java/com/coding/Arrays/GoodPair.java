package com.coding.Arrays;


public class GoodPair {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count=0;
        int []arr=new int [101];

        for(int a:nums){
            arr[a]++;
        }

        for(int n:arr){
            count+=n*(n-1)/2;
        }
//        String str="asc";
//        String st="as";
//        System.out.println(str.contains(st));
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int count=0;
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        }
//        for(Integer a:map.values()){
//            count+=a*(a-1)/2;// Formula for good number
//        }
        System.out.println(count);

    }
}
