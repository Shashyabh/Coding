package com.coding.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayBySize {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 2;
        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> st=new ArrayList<>();
        for (int i = 0; i <array.length ; i=i+splitSize) {
            int[] lst=Arrays.copyOfRange(array,i,Math.min(array.length,i+splitSize));
            st.add(lst);
        }
        return st;
    }
}
