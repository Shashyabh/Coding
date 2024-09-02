package BossCoder.Array.TwoDArray;

public class RotateMatrix {
    public static void main(String[] args) {
        int grid[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=grid.length;
        int n=grid[0].length;

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;

        for(int j=0;j<1;j++){
            left=0;
            right=n-1;
            top=0;
            bottom=m-1;
            while(top<bottom && left<right){
                int prev=grid[top+1][right];

                for(int i=right;i>=left;i--){
                    int temp=grid[top][i];
                    grid[top][i]=prev;
                    prev=temp;
                }
                top++;

                for(int i=top;i<=bottom;i++){
                    int temp=grid[i][left];
                    grid[i][left]=prev;
                    prev=temp;
                }

                left++;


                for(int i=left;i<=right;i++){
                    int temp=grid[bottom][i];
                    grid[bottom][i]=prev;
                    prev=temp;
                }
                bottom--;


                for(int i=bottom;i>=top;i--){
                    int temp=grid[i][right];
                    grid[i][right]=prev;
                    prev=temp;
                }
                right--;
            }
        }
        for(int []a:grid){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
