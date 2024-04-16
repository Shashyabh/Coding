package com.coding.String;

public class RomanToInteger {

    public static void printInt(String str){
        int answer = 0, number = 0, prev = 0;

        for (int j = str.length() - 1; j >= 0; j--) {
            switch (str.charAt(j)) {
                case 'M' : number = 1000;break;
                case 'D' : number = 500;break;
                case 'C' : number = 100;break;
                case 'L' : number = 50;break;
                case 'X' : number = 10;break;
                case 'V' : number = 5;break;
                case 'I' : number = 1; break;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        System.out.println(answer);
    }


    public static void main(String[] args) {
        String str="CDIXVIX";
        printInt(str);
    }
}
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
