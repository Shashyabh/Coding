package BossCoder.Recursion.Backtracking;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int mat[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        System.out.println(findPath(mat));
    }

    public static ArrayList<String> findPath(int[][] m) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        boolean vis[][] =new boolean[m.length][m[0].length];
        f(0,0,"",ans,m,vis);
        return ans;

    }
    public static void f(int i,int j,String temp,ArrayList<String>ans,int [][]mat,boolean vis[][]){
        if(i==mat.length-1 && j==mat[0].length-1){
            if(mat[i][j]==1){
                ans.add(temp);
            }
            return;
        }

        if(i<0||i>=mat.length || j<0 || j>=mat[0].length|| mat[i][j]==0||vis[i][j]==true){
            return;
        }
        vis[i][j]=true;

        f(i,j+1,temp+"R",ans,mat,vis);
        f(i-1,j,temp+"U",ans,mat,vis);
        f(i+1,j,temp+"D",ans,mat,vis);
        f(i,j-1,temp+"L",ans,mat,vis);
        vis[i][j]=false;
    }
}
