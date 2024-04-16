package com.OraclePrep;

public class RomanToInteger {
    public static void main(String[] args) {
        String str="CDIXVIX";
        f(str);
    }

    public static int f(String str){
        int n=str.length();
        int num=0;
        int prev=0;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            switch (ch){
                case 'M': num=1000;break;
                case 'D': num=500;break;
                case 'C': num=100;break;
                case 'L': num=50;break;
                case 'X': num=10;break;
                case 'V': num=5;break;
                case 'I': num=1;break;
            }

            if(num<prev){
                ans=ans-num;
            }
            else {
                ans=ans+num;
            }
            prev=num;
        }
        System.out.println(ans);
        return 0;
    }
}
