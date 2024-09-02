package BossCoder.Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int mat[][]={{3,7,8},{9,11,13},{15,16,17}};
        int m=mat.length;
        int n=mat[0].length;
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            int k=0;
            int max=0;
            for(int j=0;j<n;j++){
                if(min>mat[i][j]){
                    min=mat[i][j];
                    k=j;
                }
            }

            for(int j=0;j<m;j++){
                max=Math.max(max,mat[j][k]);
            }
            System.out.println(max+" "+min);

            if(max==min){
                ans.add(max);
            }
        }

        System.out.println(ans);
    }
}
