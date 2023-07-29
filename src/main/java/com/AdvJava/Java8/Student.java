package com.AdvJava.Java8;

public class Student implements Comparable<Student> {
    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        if(id==o.id)
            return 0;
        else if(id>o.id)
            return 1;
        return -1;
    }
}
