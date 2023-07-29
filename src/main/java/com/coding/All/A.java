package com.coding.All;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class A {
    public static void main(String[] args) {
        Integer coin[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Arrays.sort(coin, Collections.reverseOrder());
        System.out.println(Arrays.toString(coin));
    }
}