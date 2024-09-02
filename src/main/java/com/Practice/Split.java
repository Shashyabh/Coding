package com.Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Split {
    public static void main(String[] args) {
        int [] nums={1,2,7,4,9,1,2,4,4,3,6,3,5};
        List<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        String str="dart";
//        String st=(str.substring(3));
//        String  st1=(str.substring(0,3));
//        System.out.println(st+st1);

//        String str="madam";
//
//        int input1[]={1,0};
//        int input2[]={0,0};
//        HashSet<Integer> set=new HashSet<>();
//        for(int a:input1){
//            set.add(a);
//        }
//
//        int[][] matrix=new int[3][3];
//        List<List<Integer>>ans=new ArrayList<>();
//        for(int [] a:matrix){
//            List<Integer> temp=new ArrayList<>();
//            for(int b:a){
//                temp.add(b);
//            }
//            ans.add(temp);
//        }
//
//        for(int a:input2){
//            if(!set.contains(a)){
//                System.out.println("False");
//                break;
//            }
//        }
//        System.out.println(true);

//        List<String> ans=new ArrayList<>();
//        String s="";
//        //s=>nd and
//        for(int i=str.length()-1;i>=0;i--){
//            s=str.charAt(i)+s;
//            if(str.charAt(i)==' '){
//                ans.add(s);
//                s="";
//            }
//        }
//        ans.add(s);
//        System.out.println(ans);

        //s=s+str.charAt(i)

//        for(int i=0;i<str.length();i++){
//            s=s+str.charAt(i);
//            if(str.charAt(i)==' '){
//                ans.add(s);
//                s="";
//            }
//        }
//        ans.add(s);
//        //n+n =2n
//        for(int i=ans.size()-1;i>=0;i--){
//            System.out.println(ans.get(i));
//        }
    }
}
