package com.interview;

public class Question2 {

//    Given an array of integers A, find and return the product array of the same size where the
//    ith element of the product array will be equal to the product of all the elements divided
//    by the ith element of the array.
//        Note: It is always possible to form the product array with integer (32 bit) values.
//            Solve it without using the division operator.



//    Input 1:
//    A = [1, 2, 3, 4, 5]  "/"
//
//    Output 1:
//            [120, 60, 40, 30, 24]
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        //[1,2,6,24,120]
        //1,1,2,6,24
        int n= arr.length;;
        int arr1[] =new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i]=1;
        }

        int temp=1;
        for(int i=0;i<n;i++){
            arr1[i]=temp;
            temp=temp*arr[i];
        }
        temp=1;
        for(int i=n-1;i>=0;i--){
            arr1[i]=arr1[i]*temp;
            temp=temp*arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }

}
