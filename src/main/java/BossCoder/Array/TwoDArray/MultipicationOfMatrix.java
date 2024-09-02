package BossCoder.Array.TwoDArray;

public class MultipicationOfMatrix {
    public static void main(String[] args) {
        int [][]matrixA = {{1, 1, 1}, {1, 1, 1},
                {1, 1, 1}};
        int [][] matrixB = {{1, 1, 1}, {1, 1, 1},
                {1, 1, 1}};int n=matrixA.length;
        int[][] ans=new int[n][n];

        for(int i=0;i<n;i++){
            mul(matrixA[i],matrixB,ans,i);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
//                matrixA[i][j]=ans[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void mul(int []mat,int[][]matB,int[][] ans,int k){

        int right=matB.length-1;
        int left=0;
        int top=0;
        int bottom=matB.length-1;
        int sum=0;

        while(left<=right){
            sum=0;
            for(int i=top;i<=bottom;i++){
                sum+=mat[i]*matB[i][left];
            }
            ans[k][left]=sum;
            left++;
        }
    }
}