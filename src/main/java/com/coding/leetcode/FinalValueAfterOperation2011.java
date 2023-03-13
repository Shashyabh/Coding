package com.coding.leetcode;

public class FinalValueAfterOperation2011 {
    public static void main(String[] args) {
        String[] str ={"++X","++X","X++"};
        int value=0;
        for(int i=0;i< str.length;i++){
            String str1=str[i];
            if(str1.charAt(0)=='-'&& str1.charAt(1)=='-'){
                --value;
            }
            if(str1.charAt(0)=='+'&& str1.charAt(1)=='+'){
                ++value;
            }
            if(str1.charAt(1)=='-'&& str1.charAt(2)=='-'){
                value--;
            }
            if(str1.charAt(1)=='+'&& str1.charAt(2)=='+'){
                value++;
            }
        }
        System.out.println(value);
    }
}
