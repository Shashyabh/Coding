package com.SystemDesign.TicTacToe.Modal;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board=new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column,PlayingPiece piece){

        if(board[row][column]!=null){
            return false;
        }
        board[row][column]=piece;
        return true;
    }


}
