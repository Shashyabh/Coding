package com.coding.DP;

import java.util.ArrayList;

public class MinNoOfCoin {
    public static void main(String[] args) {
        int coin[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int n=1000;
        ArrayList<Integer>ans=new ArrayList<>();
        f(coin,n,coin.length-1,ans);
        System.out.println(ans);

    }
    public static void f(int coin[],int n,int i,ArrayList<Integer>ans){
        if(n==0 || i<0){
            return;
        }
        if(coin[i]<=n){
            ans.add(coin[i]);
            f(coin,n-coin[i],i,ans);
        }
        else{
            f(coin,n,i-1,ans);
        }

    }
}
