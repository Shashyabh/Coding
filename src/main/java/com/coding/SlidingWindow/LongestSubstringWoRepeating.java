package com.coding.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWoRepeating {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map= new HashMap<>();

        while(j<s.length()){
            char ch=s.charAt(j);
            Integer val=map.get(s.charAt(j));
            if(val!=null){
                map.put(ch,val+1);
            }
            else{
                map.put(ch,1);
            }

            if(map.size()==j-i+1){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);

                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }

        return max;
    }
}
