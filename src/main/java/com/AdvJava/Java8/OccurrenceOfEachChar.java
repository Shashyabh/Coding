package com.AdvJava.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfEachChar {

    public static void main(String[] args) {

        String str="ilovejavatechie";
        int num[]=new int[26];


        String [] word=str.split("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            num[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(num[i]!=0){
                System.out.print((char) ('a'+i)+"= "+num[i]+" ");
            }
        }
        System.out.println();


        HashMap<Character,Integer>countMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> map:countMap.entrySet()){
            System.out.print(map.getKey()+" = "+map.getValue()+"   ");
        }

        Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


//        HashMap<Character,Integer>countMap=new HashMap<>();
//        for (int i = 0; i <str.length() ; i++) {
//
//            if(countMap.get(str.charAt(i))!=null){
//                countMap.put(str.charAt(i),countMap.get(str.charAt(i))+1);
//            }
//            else {
//                countMap.put(str.charAt(i),1);
//            }
//        }
//        countMap.entrySet().forEach(entry->{
//            System.out.print(" "+entry.getKey()+" = "+entry.getValue());
//        });

        Map<String, Long> hash= Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hash);//{a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}

        List<String>res=hash.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(res);//[a, e, v, i]

        List <String>res1=hash.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(res1);//[c, t, h, j, l, o]


        int [] nums={1,2,7,4,9,1,2,4,4,3,6,3,5};
        Double integer = (double)Arrays.stream(nums).boxed().reduce((a, b) -> a + b).get();
        Double average = Arrays.stream(nums).average().getAsDouble();
        System.out.println("New avg== "+average);
        System.out.println("Total ==  "+integer/nums.length);
        //Arrays.stream(nums).boxed().collect(Collectors.averagingInt(Integer::intValue));
        int i = Arrays.stream(nums).boxed().collect(Collectors.averagingInt(Integer::intValue)).intValue();
        System.out.println("Avg = "+i);
        int asInt = Arrays.stream(nums).max().getAsInt();
        System.out.println("MMMMAAXXX= "+asInt);
        List<Integer> collect = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        System.out.println("Sorted arrays = "+collect);

        int High=Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
        System.out.println(High);

        String[] allWords={"java","microservices","springboot","apache","c prog"};
        String st=Arrays.stream(allWords).reduce((first,second)->first.length()>second.length()?first:second).get();
        System.out.println(st);//microservices

        List<String>stt=Arrays.stream(allWords).sorted().collect(Collectors.toList());
        System.out.println(stt);


        String[] results= str.split("");
        //Find each char occurrence
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


        //Second-highest number from array
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
