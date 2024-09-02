package BossCoder.Math;

public class UniquePath {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        int mat[][]=new int[m][n];

        int i=0;
        while(i<m){
            mat[i][0]=1;
            i++;
        }
        i=0;
        while(i<n){
            mat[0][i]=1;
            i++;
        }

        for(i=1;i<m;i++){
            for(int j=1;j<n;j++){
                mat[i][j]=mat[i][j-1]+mat[i-1][j];
            }
        }

        System.out.println(mat[m-1][n-1]);
    }
}
