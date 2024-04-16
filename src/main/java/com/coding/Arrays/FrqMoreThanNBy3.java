package com.coding.Arrays;

import java.util.HashMap;
import java.util.Iterator;

public class FrqMoreThanNBy3 {
    public static void main(String[] args) {
        int arr[] = {7, 7, 7, 3, 4, 4, 4, 5};
        f(arr);

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

//        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            if (value>= arr.length/3) System.out.println(key);
//        }

//        map.entrySet().forEach(entry->{
//            if (entry.getValue()>= arr.length/3) System.out.println(entry.getKey());
//        });
    }

    public static void f(int arr[]){
        int ele1=Integer.MAX_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;

        //{2,1,1,3,1}

        for(int i=0;i< arr.length;i++){

            if(arr[i]==ele1){
                count1++;
            }
            else if(arr[i]==ele2){
                count2++;
            }
            else if(count1==0){
                count1=1;
                ele1=arr[i];
            }
            else if(count2==0){
                count2=1;
                ele2=arr[i];
            }
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==ele1) {
                count1++;
            }
             else if (arr[i]==ele2) {
                count2++;
            }
        }
        if (count1>=arr.length/3) System.out.println(ele1);
        if (count2>=arr.length/3) System.out.println(ele2);

    }
}
