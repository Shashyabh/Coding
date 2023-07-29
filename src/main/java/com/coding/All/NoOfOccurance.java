package com.coding.All;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurance {
    public static void main(String[] args) {
        String str="banana";
        occured(str);
    }

    private static void occured(String str) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            Integer value=map.get(ch);
            if(value!=null){
                map.put(ch,(value+1));
            }
            else{
                map.put(ch,1);
            }
        }
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
//        final int[] ans = {0,0};
//        map.entrySet().forEach(entry->{
//            ans[0] =Math.max(ans[0],entry.getValue());
//        });
//        map.entrySet().forEach(entry->{
//            if(entry.getValue()==ans[0]){
//                ans[1]=entry.getKey();
//            }
//        });
//        System.out.println(ans[1]);

//        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//            if (it.getValue() > (n / 2)) {
//                return it.getKey();
//            }
//        }
    }
}
