package com.coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) throws Exception{
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        Integer[] flattenedArray = flatten(array);
        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws IllegalArgumentException {

        if (inputArray == null) return null;

        List<Integer> list = new ArrayList<>();

        for (Object element : inputArray) {
            if (element instanceof Integer) {
                list.add((Integer) element);
            } else if (element instanceof Object[]) {
                list.addAll(Arrays.asList(flatten((Object[]) element)));
            } else {
                throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
}
