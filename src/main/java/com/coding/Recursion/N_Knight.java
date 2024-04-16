package com.coding.Recursion;

import java.util.Scanner;

public class N_Knight {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        int n = 5;
        int[][] chess = new int[n][n];

//        int row = scn.nextInt();
//        int col = scn.nextInt();
        int row=2;
        int col=2;

        knightTour(chess,row, col, 1);
    }

    // asf -> answer so far
    public static void knightTour(int[][] chess, int row, int col, int move) {

        if(row<0|| col<0 || row>= chess.length|| col>=chess.length|| chess[row][col] > 0){
            return;
        }else if(move==chess.length * chess.length){
            chess[row][col] = move;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }

        chess[row][col] = move;
        knightTour(chess, row-2,col+1, move+1);
        knightTour(chess, row-1,col+2, move+1);
        knightTour(chess, row+1,col+2, move+1);
        knightTour(chess, row+2,col+1, move+1);
        knightTour(chess, row+2,col-1, move+1);
        knightTour(chess, row+1,col-2, move+1);
        knightTour(chess, row-1,col-2, move+1);
        knightTour(chess, row-2,col-1, move+1);

        //Back track - reset chess move
        chess[row][col] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
