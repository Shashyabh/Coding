package com.AdvJava.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User("Shashyabh",20,10000,"IT"));
        users.add(new User("Manish",21,9000,"HR"));
        users.add(new User("Ramesh",20,11000,"Finance"));
        users.add(new User("Suresh",20,13000,"Finance"));
        users.add(new User("Abc",21,7000,"IT"));
        users.add(new User("Pankaj",23,4000,"Call Support"));
        users.add(new User("Ramu",22,7000,"HR"));


        List<User> collect2 = users.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).collect(Collectors.toList());
        System.out.println("Sorted users using Lambda "+collect2);
        List<User> userStream = users.stream().sorted(Comparator.comparing(User::getUsername).reversed()).collect(Collectors.toList());
        System.out.println("Sorted User with names ::  "+userStream);

        List<String> collect1 = users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).map(m -> m.getUsername()).collect(Collectors.toList());
        System.out.println("Sorted using salary "+collect1);

        int sum=users.stream().collect(Collectors.summingInt(User::getSalary));
        System.out.println("total salary =>> "+ sum);

        Map<String, Integer> collect = users.stream().collect(Collectors.groupingBy(User::getDepartment, Collectors.summingInt(User::getSalary)));
        System.out.println("Dep wise salary=>>> "+collect);

        Map<String, Optional<User>> map = users.stream().collect(Collectors.groupingBy(User::getDepartment, Collectors.maxBy(Comparator.comparing(User::getSalary))));
        System.out.println("Max salary by each department ==>> "+map);

        User user = users.stream().collect(Collectors.maxBy(Comparator.comparing(User::getSalary))).get();
        System.out.println("Max salary of User =>> "+user);

        Optional<User> max = users.stream().max(Comparator.comparing(User::getSalary));
        System.out.println("Max salary of User =>> "+max);



//      List<String>agee=users.stream().map(ur->ur.toString()).collect(Collectors.toList());
        List<User>agee=users.stream().collect(Collectors.toList());
        System.out.println(agee);

        List<User>sorted=users.stream().sorted(Comparator.comparing(User::getSalary)).collect(Collectors.toList());
        System.out.println("Sorted users "+sorted);

        //Average salary by department
        Map<String,Double> list=users.stream().collect(Collectors.groupingBy(User::getDepartment,Collectors.averagingInt(User::getSalary)));
        System.out.println(list);
        //Output {Finance=12000.0, HR=8000.0, IT=8500.0, Call Support=4000.0}

        //Total salary of all department ->>> 61000
        int total=users.stream().collect(Collectors.summingInt(User::getSalary));
        System.out.println(total);

        //Print user whose salary is greater than 10,000
        List<User> salaryTotal=users.stream().filter(x->x.getSalary()>10000).collect(Collectors.toList());
        System.out.println(salaryTotal);
        //Output->[User{username='Ramesh', age=20, salary=11000, department=Finance},
        // {username='Suresh', age=20, salary=13000, department=Finance}]


        //Print name of user whose salary is greater than 10,000
        List<String> salaryUsername=users.stream().filter(x->x.getSalary()>10000).map(x->x.getUsername()).collect(Collectors.toList());
        System.out.println(salaryUsername);
        //Output->>[Ramesh, Suresh]


        //Print name of user whose age is greater or eqaul to 21
        List<String>ageGreater=users.stream().filter(x->x.getAge()>=21).map(x->x.getUsername()).collect(Collectors.toList());
        System.out.println(ageGreater);
        //Output->>[Manish, Abc, Pankaj, Ramu]



        ///Print total salary of each department
        Map<String,Integer>salaryByDep=users.stream().collect(Collectors.groupingBy(User::getDepartment,Collectors.summingInt(User::getSalary)));
        System.out.println(salaryByDep);

        //Output->>{Finance=24000, HR=16000, IT=17000, Call Support=4000}

        //Find one employee from each department
        // who is getting the highest salary within his departmentDepartment
        // id Find one employee from each department who is getting the highest salary within his department4

//        Map<String, Optional<User>> maxSalaryByDep = users.stream()
//        .collect(Collectors.groupingBy(User::getDepartment,
//        Collectors.maxBy(Comparator.comparing(User::getSalary))));

//        maxSalaryByDep.entrySet().forEach(entry->{
//            System.out.println(" "+entry.getKey()+"   "+entry.getValue().map(x->x.getUsername()));
//        });
    }
}
