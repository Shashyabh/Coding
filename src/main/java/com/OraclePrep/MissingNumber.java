package com.OraclePrep;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {3, 23, 77};
        List<String> missingSeries = findMissingSeries(array);

        System.out.println("Missing Number Series:");
        for (String series : missingSeries) {
            System.out.println(series);
        }
    }

    public static List<String> findMissingSeries(int[] array) {
        List<String> missingSeries = new ArrayList<>();
        int start = 0;

        for (int num : array) {
            if (num > start) {
                int end = num - 1;
                if (start == end) {
                    missingSeries.add(String.valueOf(start));
                } else {
                    missingSeries.add(start + "-" + end);
                }
            }
            start = num + 1;
        }

        if (start <= 99) {
            int end = 99;
            if (start == end) {
                missingSeries.add(String.valueOf(start));
            } else {
                missingSeries.add(start + "-" + end);
            }
        }

        return missingSeries;
    }
}
