package com.coding.String;

public class StringAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));
    }

    public static int myAtoi(String s) {
        int i=0;
        if(s.length()==0){
            return 0;
        }
        while(i<s.length()&&s.charAt(i)==' '){
            ++i;
        }
        if(i==s.length()){
            return 0;
        }
        boolean flag=false;
        if(s.charAt(i)=='-'||s.charAt(i)=='+'){
            if(s.charAt(i)=='-'){
                flag=true;
            }
            ++i;
        }
        int sum=0;

        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if (sum > (Integer.MAX_VALUE / 10) || (sum == (Integer.MAX_VALUE / 10) && digit > 7)){
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            sum=sum*10+digit;
            i++;
        }
        if(flag){
            return sum*-1;
        }
        return sum;
    }


}
