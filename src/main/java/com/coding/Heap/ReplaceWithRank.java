package com.coding.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWithRank {
    public static void main(String[] args) {
        int []arr={20, 15, 26, 2, 98, 6};
        System.out.println(Arrays.toString(replaceWithRank(arr)));
    }

    static int[] replaceWithRank(int arr[]) {
        // code here
        int ans[]=Arrays.copyOf(arr,arr.length);
        //int []ans=arr;
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(ans[i],i+1);
        }
        System.out.println(map);
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
            //int ch=map.firstKey();
        }
        return ans;
    }
}
