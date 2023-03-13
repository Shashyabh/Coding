package com.coding.DSA.RESTALL;

import java.util.ArrayList;

public class MerseTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 8, 9};
        int[] arr2 = {5, 6, 12, 24, 67};
        int[] arr3 = new int[arr1.length + arr2.length];
        int a = 0;
        int b = 0;
        int k = 0;

        while (a < arr1.length && b < arr2.length) {
            if (arr1[a] < arr2[b]) {
                arr3[k] = arr1[a];
                a++;
                k++;
            } else {
                arr3[k] = arr2[b];
                b++;
                k++;
            }
        }
        for (int i = a; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int i = b; i < arr2.length; i++) {
            arr3[k] = arr2[i];
            k++;
        }
        for (int n : arr3) {
            System.out.println(n);
        }

    }
}
