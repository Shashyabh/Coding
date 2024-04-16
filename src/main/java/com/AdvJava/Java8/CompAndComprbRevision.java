package com.AdvJava.Java8;

import java.util.*;

public class CompAndComprbRevision {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(10,"shashyabh"));
        students.add(new Student(15,"sha"));
        students.add(new Student(63,"s"));
        students.add(new Student(82,"shash"));
        students.add(new Student(34,"shashyabh Ray"));
        students.add(new Student(24,"shashyabh R"));
        students.add(new Student(48,"shashi"));

        //Collections.sort(students,(a,b)->a.id-b.id);
        Collections.sort(students,new sortBy());

        Iterator it=students.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public static class sortBy implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.id-o2.id;
        }
    }
}
