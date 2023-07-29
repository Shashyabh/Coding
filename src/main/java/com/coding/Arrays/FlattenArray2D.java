package com.coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray2D {
        public static void main( String args[] ) {

            //declare and initialize the 2D array that needs to be flattened
            Integer[][] arr = {
                    { 1, 2 },
                    { 3,4, 5, 6 },
                    { 7, 8, 9 }
            };

            //declare a list that contain streams
            List<Integer> list = new ArrayList<>();

            //for each loop to convert array in arr to stream and add the stream to streamList
            for (Integer[] array : arr) {
                Arrays.stream(array)
                        .forEach(list::add);
            }

            //flatten the stream using toArray method
            Integer[] flattenArray = list.stream().toArray(Integer[] ::new);

            //print the flattend arrays
            System.out.println("Input: " + Arrays.deepToString(arr));
            System.out.println("Output: " + Arrays.toString(flattenArray));
        }
}
