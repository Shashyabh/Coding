package com.coding.DSA.RESTALL;

public class MazePathPrinting {
    public static void main(String[] args) {
        path("",2,2);
    }
    static void path(String p,int r,int c){
        if(r==0 && c==0){
            System.out.println(p);
            return;
        }

        if(r>0){
            path(p+"D",r-1,c);
        }

        if(c>0){
            path(p+"R",r,c-1);
        }
    }
}
