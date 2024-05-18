package com.TeamWare;

public class PassByValue {
    public static void main(String[] args) {
        int x=10;
        m(x);
        System.out.println(x);

    }

    public static int m(int x){
        x=x+10;
        return x;
    }
}
