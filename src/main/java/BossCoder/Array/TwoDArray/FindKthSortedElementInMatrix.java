package BossCoder.Array.TwoDArray;

public class FindKthSortedElementInMatrix {
    public static void main(String[] args) {

        int [][]matrix={{1,5,9},{10,11,13},{12,13,15}};
        int k=8;
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];

        while(low<=high){
            int mid=low+(high-low)/2;
            int count = countLessEqual(matrix, mid);
            if(count<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }

        System.out.println(low);
    }
    public static int countLessEqual(int [][] mat,int val){
        int n=mat.length;
        int count=0;
        //int j=n-1;

        for(int i=0;i<n;i++){
//            while(j>=0 && mat[i][j]>val){
//                j--;
//            }
//            count+=(j+1);

             for(int j=0;j<n;j++){
                 if(mat[i][j]<=val){
                     count++;
                 }
             }
        }
        return count;
    }
}
