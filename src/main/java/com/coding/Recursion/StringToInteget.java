package com.coding.Recursion;

public class StringToInteget {
    public static void main(String[] args) {
        String s="46";
        System.out.println(myAtoi(s,0,true,false,0));;
    }
    public static int myAtoi(String S,int ind,boolean sign,boolean num,int total) {
        if (ind == S.length()) return total;
        if (!num) {
            if (S.charAt(ind) == ' ') return myAtoi(S, ind + 1, sign, num, total);
            if (S.charAt(ind) == '-' || S.charAt(ind) == '+') {
                sign = (S.charAt(ind) == '-' ? false : true);
                return myAtoi(S, ind + 1, sign, !num, total);
            }
        }
        num = true;
        if (ind < S.length() && Character.isDigit(S.charAt(ind))) {
            int digit = S.charAt(ind) - '0';
            if (total > (Integer.MAX_VALUE / 10) || (total == (Integer.MAX_VALUE / 10) && digit > 7)) {
                return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            total = total * 10 + digit;
        }
        return myAtoi(S,ind+1,sign,num,total);
        //int t= myAtoi(S,ind+1,sign,num,total);
//        if(t==0)return sign?total:-total;
//        else return t;
        //return total;
    }
//        char ch=S.charAt(ind);
//        if(ch-'0'<0 || ch-'0'>9) return 0;
//        if(total>Integer.MAX_VALUE/10 || total==Integer.MAX_VALUE/10 && ch-'0'>7)
//            return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
//
//        total=total*10+ch-'0';
//        int t=myAtoi(S,ind+1,sign,num,total);
//        if(t==0) return sign?total:-total;
//        else return t;
}
