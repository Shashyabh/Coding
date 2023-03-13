package com.coding.DSA.RESTALL;

import java.util.Arrays;

public class MazeAllPathPrintingBacktracking {
    public static void main(String[] args) {
        boolean[][] board={{true,true,true},{true,true,true},{true,true,true}};
        //allPath("",board, 0,0);
        int[][] path=new int[board.length][board[0].length];
        pathPrinting("",board,0,0,path,1);
    }

    public static void allPath(String p,boolean [][] maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPath(p+'L',maze,r,c-1);
        }
        maze[r][c]=true;
    }

    public static void pathPrinting(String p,boolean [][] maze, int r, int c,int [][]path, int step){
        if(r== maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int [] ans:path){
                System.out.println(Arrays.toString(ans));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;

        if(r< maze.length-1){
            pathPrinting(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            pathPrinting(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            pathPrinting(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            pathPrinting(p+'L',maze,r,c-1,path,step+1);
        }
        path[r][c]=0;
        maze[r][c]=true;
    }
}
