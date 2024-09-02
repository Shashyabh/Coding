package BossCoder.Array.TwoDArray;

public class ShortestDistanceAfterRoadAddition {
    public static void main(String[] args) {
        int nums[][]={{2,4},{0,2},{0,4}};
        int n=5;
        shortestDistanceAfterQueries(n,nums);
    }

    public static void shortestDistanceAfterQueries(int n, int[][] nums) {
        // int m=nums.length;
        boolean vis[]=new boolean[n];
        int ans[]=new int[n];
        int k=0;
        for(int []arr:nums){
            int count=1;
            for(int i=0;i<n;i++){
                if(vis[i]==false){
                    if(i==arr[0]){
                        while(i!=arr[1]+1){
                            vis[i]=true;
                            i++;
                        }
                    }
                    else {
                        count++;
                    }
                }

            }
            ans[k++]=count;
        }

        for (int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
