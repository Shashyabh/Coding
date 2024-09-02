package BossCoder.Array.TwoDArray;

public class TicTacToeWinner {
    public static void main(String[] args) {
        int [][] mat=new int[3][3];
        int moves[][]={{2,2},{0,2},{1,0},{0,1},{2,0},{0,0}};
        for(int i=0;i<moves.length;i++)
        {
            if(i%2==0)
            {
                mat[moves[i][0]][moves[i][1]]=1;
            }
            else{
                mat[moves[i][0]][moves[i][1]]=2;
            }
        }

        System.out.println(winner(mat));

    }

    public static String winner(int board[][]){

        //Check all rows

        for(int i=0;i<3;i++)
        {
            int countA=0;
            int countB=0;

            for(int j=0;j<3;j++)
            {
                if(board[i][j]==1)countA++;
                if(board[i][j]==2)countB++;
            }

            if(countA==3)return "A";
            if(countB==3)return "B";
        }

        //For checking all columns
        for(int j=0;j<3;j++){
            int countA=0;
            int countB=0;

            for(int i=0;i<3;i++){
                if(board[i][j]==1)countA++;
                if(board[i][j]==2)countB++;
            }

            if(countA==3)return "A";
            if(countB==3)return "B";
        }


        //check both diagonal
        if(board[0][0]==1 && board[1][1]==1 && board[2][2]==1)return "A";
        if(board[0][0]==2 && board[1][1]==2 && board[2][2]==2)return "B";

        if(board[0][2]==1 && board[1][1]==1 && board[2][0]==1) return "A";
        if(board[0][2]==2 && board[1][1]==2 && board[2][0]==2) return "B";


        //check for pending or draw
        int count =0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==1 || board[i][j]==2)count++;
            }
        }

        if(count!=9) return "Pending";
        return "Draw";
    }
}