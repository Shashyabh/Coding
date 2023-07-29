package com.coding.String;

public class ReplaceAllDigitWithChar {
    public static void main(String[] args) {
        String str= "a1b2c3d4e";
        replaceDigit(str);
    }

    private static void replaceDigit(String str) {

        String str1="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                str1=str1+str.charAt(i);
            }
            else {

                if(ch=='0'){
                    str1=str1+(char)(str.charAt(i-1)+0);
                }
                if(ch=='1'){
                    str1=str1+(char)(str.charAt(i-1)+1);
                }
                if(ch=='2'){
                    str1=str1+(char)(str.charAt(i-1)+2);
                }
                if(ch=='3'){
                    str1=str1+(char)(str.charAt(i-1)+3);
                }
                if(ch=='4'){
                    str1=str1+(char)(str.charAt(i-1)+4);
                }
                if(ch=='5'){
                    str1=str1+(char)(str.charAt(i-1)+5);
                }
                if(ch=='6'){
                    str1=str1+(char)(str.charAt(i-1)+6);
                }
                if(ch=='7'){
                    str1=str1+(char)(str.charAt(i-1)+7);
                }
                if(ch=='8'){
                    str1=str1+(char)(str.charAt(i-1)+8);
                }
                if(ch=='9'){
                    str1=str1+(char)(str.charAt(i-1)+9);
                }
                 //"abbdcfdhe"
            }
        }
        System.out.println(str1);
    }

}
