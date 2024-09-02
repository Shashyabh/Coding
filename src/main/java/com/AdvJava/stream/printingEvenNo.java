package com.AdvJava.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class printingEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(5);


//        List<Integer> collect1 = arr.stream().map(m -> m * 2).collect(Collectors.toList());
//        System.out.println(collect1);
//        List<Integer> collect = arr.stream().filter(f -> f % 2 != 0).collect(Collectors.toList());
//        System.out.println(collect);

//        int i = arr.stream().reduce(0, (a, b) -> (a + b)).intValue();
//        System.out.println(i);
        String str="anandana";
        HashMap<String,Integer>map=new HashMap<>();

        String[] words=str.split("");

        Map<String, Long> collect = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Collect Method "+collect);

        for(int i=0;i< words.length;i++){
            if(map.get(words[i])==null){
                map.put(words[i],1);
            }
            else{
                map.put(words[i],map.get(words[i])+1);
            }
        }
//        System.out.println(map);

        //System.out.println(122718074&16);
        //key value hashcode next
        //Key value



//        Integer collect = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.summingInt(Integer::intValue));
//        Integer reduce = arr.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
//
//        System.out.println("Sum of even = >> "+collect+"  "+reduce);
//
//        List<Integer> list=arr.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(list);
//
//        List<Integer>list1=arr.stream().filter(x->x>3).collect(Collectors.toList());
//        System.out.println(list1);
//        int list2=arr.stream().map(x->x%2==0?x*x:0).reduce(0,(sum,i)->sum+i);
//        System.out.println(list2);
//
//        System.out.println(1+2+"a"+"b"+3+4+"abc");//3ab34abc
//        System.out.println('a');//a
//        System.out.println('a'+3);//97+3//op->100
//        System.out.println('a'+'b');//97+98//op->195
//        System.out.println('a'+"sha");//asha
//        System.out.println('a'+'b'+"sha");//97+98+sha//195sha
//        System.out.println("sha"+'s'+'h');//shash

        //(){}[]->true ->true  [{(})]->false  Use Stack
        String strrr="[{()}]";
        Stack<Character> st=new Stack<>();
        st.push('a');
        st.pop();
        st.isEmpty();
        st.size();
    }
}
