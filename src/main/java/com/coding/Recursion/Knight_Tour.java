package com.coding.Recursion;

public class Knight_Tour {
    static boolean  dest=false;
    public static void main(String[] args) {
        int [][] grid={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        f(grid,0,0,0);
        System.out.println(dest);
    }
    public static void f(int[][] grid,int row,int col,int num){
        if(row<0 || row>=grid.length || col<0 || col>=grid.length || grid[row][col]!=num){
            return;
        }
        if(grid[row][col]==grid.length*grid.length-1){
            dest=true;
        }
        //grid[row][col]=-1;
        f(grid,row-2,col-1,num+1);
        f(grid,row-1,col-2,num+1);
        f(grid,row-2,col+1,num+1);
        f(grid,row-1,col+2,num+1);
        f(grid,row+2,col+1,num+1);
        f(grid,row+1,col+2,num+1);
        f(grid,row+2,col-1,num+1);
        f(grid,row+1,col-2,num+1);
    }
}
