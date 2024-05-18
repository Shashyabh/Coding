package com.AdvJava.Java8;

import java.util.*;

public class ComparatorAndComparable {
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
        //Collections.sort(list,new sortById());

        //Collections.sort(list,(a,b)->a.id-b.id);
        //Collections.sort(list,(Student obj1,Student obj2)->obj2.id-obj1.id);
        Iterator<Student> it=list.iterator();
        ListIterator<Student> st= list.listIterator();
        //ListIterator<Student> st=list.listIterator();
        while(st.hasNext()){
            System.out.println(st.next());
        }
        System.out.println(new String("FB").hashCode());
        System.out.println(new String("Ea").hashCode());
        // System.out.println(list);
    }

    public static class sortById implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2){
            return st2.id-st1.id;
            //return st1.compareTo(st2);
        }
    }
}
