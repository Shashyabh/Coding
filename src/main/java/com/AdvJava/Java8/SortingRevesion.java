package com.AdvJava.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingRevesion {

    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User("abc",22,10282,"SCI"));
        users.add(new User("bdj",24,7022,"MATH"));
        users.add(new User("gsj",53,84982,"SCI"));
        users.add(new User("isd",32,92712,"MATH"));
        users.add(new User("kana",20,6282,"ENV"));
        users.add(new User("bdjjk",19,7291,"ENV"));
        users.add(new User("iwh",32,82927,"SCI"));


//        Map<String, Long> collect = users.stream().collect(Collectors.groupingBy(User::getDepartment, Collectors.counting()));
        //[SCI=3, MATH=2, ENV=2]

//        List<Map.Entry<String, Double>> entries = users.stream().collect(Collectors.groupingBy(User::getDepartment, Collectors.averagingInt(User::getSalary))).entrySet().stream().toList();
//        [SCI=59397.0, MATH=49867.0, ENV=6786.5]

//        List<Map.Entry<String, List<User>>> entries = users.stream().collect(Collectors.groupingBy(User::getDepartment)).entrySet().stream().toList();
//        entries.forEach(entry->{
//            System.out.println(entry.getKey()+" "+entry.getValue().stream().map(m-> m.getUsername()).collect(Collectors.toList()));
//        });
//
//        SCI [abc, gsj, iwh]
//        MATH [bdj, isd]
//        ENV [kana, bdjjk]


//        List<User> collect = users.stream().sorted(Comparator.comparingInt(User::getSalary)).collect(Collectors.toList());
//        System.out.println(collect);
//
//        List<User> userList = users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).collect(Collectors.toList());
        //System.out.println(userList);
    }
}
