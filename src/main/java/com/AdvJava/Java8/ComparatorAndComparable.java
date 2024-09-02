package com.AdvJava.Java8;

import java.util.*;
import java.util.function.Function;

public class ComparatorAndComparable {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"Shashyabh"));
        list.add(new Student(2,"Ybnhii"));
        list.add(new Student(15,"echbj"));
        list.add(new Student(31,"echbj"));
        list.add(new Student(16,"mnuhb"));
        list.add(new Student(7,"echbj"));
        Collections.sort(list,(a,b)->a.id-b.id);
        Collections.sort(list,new sortByComparator().thenComparing(Comparator.comparing(Student::getId)));


        //Collections.sort(list,new sortById());

        //Collections.sort(list,(a,b)->a.id-b.id);
        //Collections.sort(list,(Student obj1,Student obj2)->obj2.id-obj1.id);
        Iterator<Student> it=list.iterator();
        ListIterator<Student> st= list.listIterator();
        //ListIterator<Student> st=list.listIterator();
        while(st.hasNext()){
            System.out.println(st.next());
        }
        //System.out.println(new String("FB").hashCode());
        //System.out.println(new String("Ea").hashCode());
        // System.out.println(list);
    }


    public static class sortByComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
            //return o1.compareTo(o2);
        }
    }

//    public static class sortById implements Comparator<Student>{
//        @Override
//        public int compare(Student st1, Student st2){
//            return st2.id-st1.id;
//            //return st1.compareTo(st2);
//        }
//    }
}
