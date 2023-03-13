package com.coding.leetcode;

public class RichestCostumerWelgth {
    public static void main(String[] args) {
        int[][] arr={{1,2,4,5},{6,3,2,9},{2,5}};
        int total=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=arr[i][j]+sum;
            }
            if(sum>total){
                total=sum;
            }
            sum=0;
        }
        System.out.println(total);
    }
}
