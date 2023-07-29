package com.AdvJava.Java8;

import java.util.*;

public class ComaratorAndComparable {
    public static void main(String[] args) {

//        HashMap<Integer,Student> map=new HashMap<>();
//
//        map.put(1,new Student(3,"Shashyabh"));
//        map.put(2,new Student(2,"Shash"));
//        map.put(3,new Student(15,"Shasi"));
//        map.put(4,new Student(31,"Shashi"));
//        map.put(5,new Student(16,"Shashya"));
//        map.put(6,new Student(7,"ShashyabhRay"));

        List<Student> list=new ArrayList<>();
        list.add(new Student(3,"Shashyabh"));
        list.add(new Student(2,"Shash"));
        list.add(new Student(15,"Shasi"));
        list.add(new Student(31,"Shashi"));
        list.add(new Student(16,"Shashya"));
        list.add(new Student(7,"ShashyabhRay"));


        //Collections.sort(list);

        Collections.sort(list,(a,b)->a.id-b.id);
        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // System.out.println(list);
    }

    public static class sortById implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2){
            return st1.id-st2.id;
        }
    }
}
