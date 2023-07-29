package com.interview;

public class ZeroOne {
    public static void main(String[] args) {
        int[]arr={0,1,1,0,1,0,1,0,0};
        //op-[0,0,0,0,0,1,1,1,1]

        int zero=0;
        int one=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else {
                one++;
            }
        }

        int x=0;
        while(zero!=0){
            arr[x]=0;
            x++;
        }
    }
}
