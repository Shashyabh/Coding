package com.coding.Recursion;

import java.util.ArrayList;

public class WordSearch {
    public static void main(String[] args) {

        char[][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(exist(board,"SEE"));
    }
    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int [][] vis=new int[m][n];
        ArrayList<Character>str =new ArrayList<>();

        String sb="";
        // StringBuilder sb=new StringBuilder();

        f(board,word,vis,str,m,n,0,0,0);
        for(Character s:str){
            sb=sb+s;
        }
        if(sb.equals(word)) return true;
        return false;


    }
    public static void f(char[][] board,String word,int [][] vis,ArrayList<Character>str,int m,int n,int k,int i,int j){
        if(word.length()==0){
            return;
        }
        if(k!=0 && i<0||j<0||i>=m||j>=n|| vis[i][j]==1 || board[i][j]!=word.charAt(k)){
            return;
        }

        if(board[i][j]==word.charAt(k)){
            str.add(word.charAt(k));
            k++;
        }
        System.out.println(str);
        vis[i][j]=1;
        f(board,word,vis,str,m,n,k,i-1,j);
        f(board,word,vis,str,m,n,k,i+1,j);
        f(board,word,vis,str,m,n,k,i,j-1);
        f(board,word,vis,str,m,n,k,i,j+1);
        vis[i][j]=0;

    }
}
