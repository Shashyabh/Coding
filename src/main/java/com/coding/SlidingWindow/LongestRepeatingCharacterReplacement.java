package com.coding.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String S, int k) {

        int  i=0;
        int j=0;
        int max=0;
        int currMax=0;
        int arr[]=new int [26];

        while(j<S.length()){
            arr[S.charAt(j)-'A']++;
            int currChar=arr[S.charAt(j)-'A'];
            currMax=Math.max(currMax,currChar);

            while(j-i-currMax+1>k){
                arr[S.charAt(i)-'A']--;
                i++;
            }

            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
