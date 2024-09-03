package com.AdvJava.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private final int id;
    private final String name;
    final List<String> phones;

    public Student(int id, String name, List<String> phones) {
        this.id = id;
        this.name = name;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return new ArrayList<>(phones);
    }
//    //    public void setName(String name) {
////        this.name = name;
////    }


//    public List<String> getPhones() {
//        return phones;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}

