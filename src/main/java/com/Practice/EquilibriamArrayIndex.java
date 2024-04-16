package com.Practice;

public class EquilibriamArrayIndex {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, -5, -3, 3};
        int equilibriumIndex = optimize(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }

    public static int optimize(int arr[]){

        int total=0;
        int left=0;
        int n=arr.length;

        for(int a:arr){
            total+=a;
        }

        for(int i=0;i<n;i++){
            total-=arr[i];
            if(total==left){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }

    public static int brute(int arr[]){

        int n=arr.length;

        for(int i=0;i<n;i++){
            int left=0;
            int right=0;
            for(int j=0;j<i;j++){
                left+=arr[j];
            }

            for(int j=i+1;j<n;j++){
                right+=arr[j];
            }

            if(left==right){
                return i;
            }
        }

        return -1;
    }
}
