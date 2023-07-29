package com.coding.DP;

public class KnapSack01 {
    public static void main(String[] args) {
        int n = 2;
        int W = 4;
        int val[] = {2,3};
        int wt[] = {5,1};
        int dp[][] = new int [n][W+1];

        for (int w = wt[0]; w <= W; w++){
            dp[0][w]=val[0];
        }

        for (int i =1; i < n; i++)
        {
            for (int w = 0; w <= W; w++)
            {
                int pick=-99999;
                if(wt[i]<=w){
                    pick = val[i] + dp[i-1][w-wt[i]];
                }
                int notpick=dp[i-1][w];

                dp[i][w]=Math.max(pick,notpick);
            }
        }

        System.out.println(dp[n-1][W]);
    }
}
