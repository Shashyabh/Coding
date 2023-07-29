package com.coding.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        subset(result,new ArrayList<>(),nums,0);
        for(List<Integer>s:result){
            System.out.println(s);
//            if(s.size()==2){
//                System.out.println(s);
//            }
        }

    }

    public static void subset(List<List<Integer>> list,List<Integer>temp,int[]nums,int k){
        list.add(new ArrayList<>(temp));

        for (int i = k; i < nums.length ; i++) {
            if(temp.contains(nums[i])) continue;
            //if(i > k && nums[i] == nums[i-1]) continue; contains duplicates
            else {
                temp.add(nums[i]);
                subset(list,temp,nums,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
//Permutations: [1,2,3] tempList of backtracking solution displayed here:
//        Before removal: 1
//        Before removal: 1 2
//        Before removal: 1 2 3
//        After removal: 1 2
//        After removal: 1
//        Before removal: 1 3
//        Before removal: 1 3 2
//        After removal: 1 3
//        After removal: 1
//        After removal:
//        Before removal: 2
//        Before removal: 2 1
//        Before removal: 2 1 3
//        After removal: 2 1
//        After removal: 2
//        Before removal: 2 3
//        Before removal: 2 3 1
//        After removal: 2 3
//        After removal: 2
//        After removal:
//        Before removal: 3
//        Before removal: 3 1
//        Before removal: 3 1 2
//        After removal: 3 1
//        After removal: 3
//        Before removal: 3 2
//        Before removal: 3 2 1
//        After removal: 3 2
//        After removal: 3
//        After removal:
