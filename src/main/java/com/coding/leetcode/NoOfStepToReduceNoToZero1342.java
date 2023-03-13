package com.coding.leetcode;

public class NoOfStepToReduceNoToZero1342 {
    public static void main(String[] args) {
            int num=123;
            int c=reduceNumber(num);
           System.out.println(c);
//        int count=0;
//        while (num>0){
//            if(num%2==0){
//                count++;
//                num=num/2;
//            }
//            else{
//                count++;
//                num=num-1;
//            }
//        }
//        System.out.println(count);
    }

    private static int reduceNumber(int num) {
        return helper(num,0);
    }
    static int helper(int num, int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return helper(num/2,count+1);
        }
        else {
            return helper(num-1,count+1);
        }
    }

}
