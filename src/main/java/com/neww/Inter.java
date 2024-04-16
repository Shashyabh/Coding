package com.neww;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Inter {
    public static void main(String[] args) {

        int [] arr={5,15,10,55,45,10,40};
        Integer integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
        System.out.println("Max = "+ integer);

        List<Integer> integers = IntStream.concat(Arrays.stream(new int[]{1, 2, 3}), Arrays.stream(new int[]{2, 3, 4, 5})).boxed().distinct().sorted().collect(Collectors.toList());
        //System.out.println(integers);



        //int [] arr1={1,2,3};
        List<Integer>arr1=Arrays.asList(1,2,3);
        List<Integer>arr2=Arrays.asList(2,3,4,5);

        List<Integer> collect = Stream.concat(arr1.stream(),arr2.stream()).distinct().sorted().collect(Collectors.toList());
       // System.out.println(collect);

        String[] arr3 = {"apple", "banana", "orange"};
        String[] arr4 = {"banana", "grape", "kiwi", "apple"};

        List<String> collect1 = Stream.concat(Arrays.stream(arr3), Arrays.stream(arr4)).distinct().sorted().collect(Collectors.toList());
        System.out.println(collect1);

//        int i=0;
//        int j=0;
//        List<Integer> arr=new ArrayList<>();
//        while (i<arr1.length && j<arr2.length){
//            if(arr1[i]<arr2[j]){
//                arr.add(arr1[i]);
//                i++;
//            } else if (arr1[i]==arr2[j]) {
//                i++;
//            } else {
//                arr.add(arr2[j]);
//                j++;
//            }
//
//        }
//
//        while (i<arr1.length){
//            arr.add(arr1[i]);
//            i++;
//        }
//
//        while (j<arr2.length){
//            arr.add(arr2[j]);
//            j++;
//        }
//        arr.stream().forEach(System.out::println);



//        HashSet<Integer> set=new HashSet<>();
//
//        int m=arr1.length;
//        int n=arr2.length;
//        for(int i=0;i<m;i++){
//            set.add(arr1[i]);
//        }
//        for(int j=0;j<n;j++){
//            set.add(arr2[j]);
//        }
//
//        System.out.println(set);
    }
}
