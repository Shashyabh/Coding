package com.coding.All;

public class SecondHeighestNo {
    public static void main(String[] args) {
        int arr[]={3,5,266,71,9,111,22};
        greaterNo(arr);
    }

    private static void greaterNo(int[] arr) {
//        System.out.println("Enter your number : ");
//        Scanner sc =new Scanner(System.in);
//        int k= sc.nextInt();
        int key=arr[0];
        int key1=arr[0];
        for(int i=0;i< arr.length;i++){
            if(key<arr[i]){
                key=arr[i];
            }
        }
        for(int i=0;i< arr.length;i++){
            if( key1<arr[i] && arr[i]!=key) {
                key1=arr[i];
            }
        }
        System.out.println("Second  heighest no is = "+key1);
    }
}
