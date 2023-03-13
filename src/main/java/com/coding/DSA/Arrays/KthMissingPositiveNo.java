package com.coding.DSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class KthMissingPositiveNo {
    public static void main(String[] args) {
        int[]nums={1,2};//{2,4,7,8,11,13,19,21,25,28,29,30,33,34,35,36,37,39,40,41,44,45,46};//{1,2,3,4};//{2,3,4,7,11};
        int k=1;
        missingPositive(nums,k);
//        System.out.println(ch);
    }

    private static void missingPositive(int[] nums, int k) {
        HashSet<Integer>set =new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        Iterator itr= set.iterator();
        int x=0;
        while (itr.hasNext()&&k>0){
            if(!set.contains(x)){
                k--;
                x++;
            }
            else{
                x++;
            }
        }
        System.out.println(x);
    }

//    private static int missingPositive(int[] nums, int k) {
//
//        LinkedHashSet<Integer> set=new LinkedHashSet<>();
//        LinkedHashSet<Integer>set1=new LinkedHashSet<>();
//        for(int a:nums){
//            set.add(a);
//        }
//        for(int i=1;i<=nums[nums.length-1]||i<= nums.length+k;i++){
//            if(!set.contains(i)){
//                set1.add(i);
//            }
//        }
//
//
//        System.out.println(set1);
//        Iterator itr= set1.iterator();
//        int n=0;
//            while (itr.hasNext()){
//                int x = (int) itr.next();
//                n++;
//                if(n==k){
//                    return x;
//                }
//            }
//            return 0;
//    }

//    private static void missingPositive(int[] nums, int k) {
//        int i=0;
//        while(nums[i]>0 && nums[i]<nums.length &&i< nums.length){
//            int correct=nums[i]-1;
//            if(nums[i]!=nums[correct]){
//                swap(nums,i,correct);
//            }
//            else {
//                i++;
//            }
//        }
//        HashSet<Integer> set=new HashSet<>();
//
//        System.out.println(Arrays.toString(nums));
//        int n=0;
//        for (int j = 0; j < nums[nums.length-1]; j++) {
//            if(j< nums.length){
//                if(j!=nums[j]-1){
//                    set.add(nums[j]);
//                }
//            }
//            else {
//                if(!set.contains(j)){
//                    set.add(j);
//                }
//            }
//        }
//        System.out.println(set);
//    }
//    private static void swap(int[]nums,int first,int second){
//        int temp=nums[first];
//        nums[first]=nums[second];
//        nums[second]=temp;
//    }
}
