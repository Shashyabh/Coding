package com.coding.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MedianOfArraty {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int []arr=new int[n];
        int []arr1=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        int no= sc.nextInt();

        int sum=0;
        for(int i=0;i<no;i++){
            for (int j = 0; j <n ; j++) {
                arr1[j]=arr[j];
            }
           int start=sc.nextInt();
           int end=sc.nextInt();
                Arrays.sort(arr1,start-1,end);
                int len=(end-start)+1;
                int mid=((end-start)+1)/2;
                if(len%2==0){
                    sum=(arr1[mid]+arr1[mid-1])/2;
                }
                else {
                    sum=arr1[mid+1];//1,2,3,4,5,6 == 2,4,5,3,1,6
                }
            System.out.println(sum);
        }
    }

//    public static void sorting(int[]nums,int start,int end){
//
//        Arrays.sort(nums, start - 1, end);
//    }
}
