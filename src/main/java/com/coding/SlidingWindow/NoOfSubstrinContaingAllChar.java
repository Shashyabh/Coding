package com.coding.SlidingWindow;

public class NoOfSubstrinContaingAllChar {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
    public static int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int arr[]=new int[3];
        int count=0;

        while(j<s.length()){
            arr[s.charAt(j)-'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count+=s.length()-j;
                arr[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return count;
    }
}
