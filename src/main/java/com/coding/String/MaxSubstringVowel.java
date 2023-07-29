package com.coding.String;

public class MaxSubstringVowel {
    public static void main(String[] args) {
        String str="weallloveyou";
        int k=3;

        System.out.println(f(str,k));
    }

    public static int f(String str,int k){
        int count=0;
        int max=0;

        for(int ii=0;ii<=str.length()-k&&k<str.length();ii++){
            String s=str.substring(ii,k+ii);
            count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    count++;
                    max=Math.max(max,count);
                    if(count==k){
                        return k;
                    }
                }
            }
        }
        return max;

    }
//    public static int f(String str,int k,int i,String s){
//        if(i<str.length() && k==0){
//            return 1;
//        }
//        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//            return f(str.substring(1),k-1,i+1,s+str.charAt(i));
//        }
//        return 0;
//    }
}
