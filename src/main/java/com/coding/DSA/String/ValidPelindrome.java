package com.coding.DSA.String;

public class ValidPelindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        //String s="0P";
        validPelindrome(s);
        //65-90 97-122
    }

    private static void validPelindrome(String s) {
        String str = s.toLowerCase();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ||ch>='0'&&ch<='9') {
                sb.append(str.charAt(i));
            }
        }
        //System.out.println(sb);
        String sb1 = "";
        for (int i = 0; i < sb.length(); i++) {
            sb1 = sb.charAt(i) + sb1;
        }
        boolean t=true;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != sb1.charAt(i)) {
                t=false;
                break;
            }
        }
        if (t==false){
            System.out.println("Not Pelindrome");
        }
        else {
            System.out.println("Pelindrome");
        }
    }
}
