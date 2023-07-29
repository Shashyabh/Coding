package com.coding.Contest;

import java.util.Arrays;
import java.util.HashSet;

public class FindBot {
    public static void main(String[] args) {
        int n = 4;
        String []usernames = {"abcdef", "pqrs", "xyzuvabb", "aaaaaa"};
        System.out.println(Arrays.toString(findBots(usernames,n)));

    }
    public static int[] findBots(String usernames[], int n){
        // Code Here.

        int[] ans=new int[n];

        int k=0;
        for(String s:usernames){
            HashSet<Character> set=new HashSet<>();
            int count=0;
            for(int j=0;j<s.length();j+=2){
                char ch=s.charAt(j);
                if(!set.contains(ch)){
                    set.add(ch);
                    count++;
                }
            }
            if(isPrime(count)){
                ans[k]=1;
                k++;
            }
            else{
                ans[k]=0;
                k++;
            }
        }
        return ans;

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
