package com.coding.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachChar {
    public static void main(String[] args) {
        String str="ilovejavatechie";

        String [] word=str.split("");

        Map<String, Long> hash= Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<String>res=hash.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(res);

        List <String>res1=hash.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(res1);


        int [] nums={1,2,7,4,9,22,12,4,64,13,76,43,55};
        int High=Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
        System.out.println(High);

        String[] allWords={"java","microservices","springboot","apache","c prog"};
        String st=Arrays.stream(allWords).reduce((first,second)->first.length()>second.length()?first:second).get();
        System.out.println(st);

        List<String>stt=Arrays.stream(allWords).sorted().collect(Collectors.toList());
        System.out.println(stt);


        String[] results= str.split("");
        //Find the each char occurence
        Map<String, Long> map=Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //Output->>{a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}

        //Find the duplicate element inside String

        Map<String, Long> map1=Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<String>duplicates=map1.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        //Output [a, e, v, i]


        //Find the unique element inside String

        Map<String, Long> map2=Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<String>unique=map2.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
        //Output [c, t, h, j, l, o]


        //First non repeat element

        String firstNonRepeat=Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .findFirst().get().getKey();

        //Output ->> l


        //Second highest number from array
        int [] arr={5,9,11,2,8,21,1};
        Integer secondHighest=Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        //Output ->> 11


        //Longest string in array

        String[] words={"java","microservices","springboot"};
        String longestString=Arrays.stream(words)
                        .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
                                .get();

        //Output->>> Microservices
//        System.out.println(longestString);

    }
}
