package com.coding.Recursion;

import java.util.List;

public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board=new boolean[n][n];
        f(board,0,n);
    }

    public static void f(boolean[][] board, int row, int n){
        if(row==n){
            for(boolean[] b:board){
                for(boolean e:b){
                    if(e){
                        System.out.print("Q ");
                    }
                    else{
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int col=0;col<n;col++){
            if(isSafe(row,col,board)){
                board[row][col]=true;
                f(board,row+1,n);
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(int row, int col, boolean[][] board) {

        //Check vertical Diagonal

        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //For left diagonal
        int leftMax=Math.min(row,col);
        for(int i=1;i<=leftMax;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //For right Diagonal
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}
