package com.coding.DP;

public class LongestPelindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    static String max = "";
    static int maxLength = 0;

    public static String longestPalindrome(String s) {

        for(int i=0;i<s.length();i++){
            //for odd length palindromes
            longestPal(i,i,s);
            //for even length palindromes
            longestPal(i,i+1,s);
        }
        return max;
    }

    //Expand around center
    private static void longestPal(int left,int right,String s){
        // check out of bounce and if left and right are equal.

        if(left>right || left<0 || right>=s.length() || s.charAt(left)!=s.charAt(right) )
            return;
        //update maxLength and max accordingly
        if(maxLength<right-left+1){
            maxLength = right - left + 1;
            max = s.substring(left,right+1);
        }
        //expand further.
        longestPal(left-1,right+1,s);
    }
}
