package com.coding.Recursion;

import java.util.ArrayList;

public class RatInTheMaze {
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},{1, 1, 0, 1},{1, 1, 0, 0},{0, 1, 1, 1}};
        System.out.println(findPath(maze,4));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans =new ArrayList<>();
        f(ans,m,"",n-1,n-1);
        return ans;
    }

    public static void f(ArrayList<String> ans,int[][]maze,String str,int i,int j){
        if(i==0&&j==0){
            ans.add(str);
        }
        if(i<0||j<0){
            return;
        }

        if(maze[i][j]==1){
            f(ans,maze,"D"+str,i-1,j);
            f(ans,maze,"R"+str,i,j-1);
        }
    }
}
