package com.OraclePrep;

public class ClosestPalindrome {

    public static void main(String[] args) {
        int n = 7;
        int result = closestPalindromeBruteforce(n);
        System.out.println("Closest palindrome to " + n + ": " + result);
    }

    public static boolean checkPelindrome(int num){
        String no=Integer.toString(num);
        String str=new StringBuilder(no).reverse().toString();
        return no.equals(str);
    }

    public static int closestPalindromeBruteforce(int n){
        int lower=n-1;
        int upper=n+1;
        while (!checkPelindrome(upper) && !checkPelindrome(lower)){
            lower--;
            upper++;
        }
        return checkPelindrome(upper)?upper:lower;
    }
}
