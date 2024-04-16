package com.interview;

public class Question1 {
    public static void main(String[] args) {
        int arr[] = {2,1,1,1,1,2,1,1,1,1,1};

        //count 1: 3>2
        // n/3=2
        //O(n)
        //0(n) size

        int Count1 = 0;
        int count2=0;
        int ele = 0;
        int ele1=0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                Count1++;
            } else if (ele1==arr[i]) {
                count2++;
            } else if (Count1==0) {
                Count1=1;
                ele=arr[i];
            }
            else if (count2==0) {
                count2=1;
                ele1=arr[i];
            }
            else {
                count2--;
                Count1--;
            }
        }


        Count1 = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == ele) {
                Count1++;
            }
            else if(arr[j]==ele1){
                count2++;
            }
        }
        if (Count1>n/3) {
            System.out.println(ele);
        }
        else if(count2>n/3) {
            System.out.println(ele1);
        }
        else {
            System.out.println("-1");
        }
    }
}
