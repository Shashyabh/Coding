package com.AdvJava.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {

        List<User> users=new ArrayList<User>();
        users.add(new User("abc",22,10282,"SCI"));
        users.add(new User("bdj",24,7022,"MATH"));
        users.add(new User("gsj",53,84982,"SCI"));
        users.add(new User("isd",32,92712,"MATH"));
        users.add(new User("kana",20,6282,"ENV"));
        users.add(new User("bdjjk",19,7291,"ENV"));
        users.add(new User("iwh",32,82927,"SCI"));

        List<User> collect2 = users.stream().sorted(Comparator.comparing(User::getDepartment).thenComparing(User::getUsername)).collect(Collectors.toList());
        System.out.println("Sorted by Dep "+collect2);

        List<User> userList = users.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        System.out.println(userList.toString());

        List<User> userList1 = users.stream().filter(user -> user.getSalary() > 10000).collect(Collectors.toList());
        System.out.println(userList1.toString());

        List<User> userList2 = users.stream().sorted(Comparator.comparingInt(User::getSalary)).collect(Collectors.toList());
        System.out.println(userList2.toString());

        String[] str={"abc","abc","ab","abc","ab","abde"};

        Map<String, String> collect1 = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.joining()));
        //System.out.println("Joining");
        Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String,Long>entry:collect.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

        String s = Arrays.stream(str).reduce((first, second) -> first.length() > second.length() ? first : second).get();
        System.out.println(s);
    }

}
