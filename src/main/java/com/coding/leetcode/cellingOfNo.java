package com.coding.leetcode;

public class cellingOfNo {

    public static void main(String[] args) {

         int [] arr={1,3,5,7,9,15,25,45,71};
        int target=28;
        int value=celling(arr,target);
        System.out.println(value);
    }

    private static int celling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }

        }
        return arr[start];
    }

}
