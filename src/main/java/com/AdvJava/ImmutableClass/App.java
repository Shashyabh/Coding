package com.AdvJava.ImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        List<String > phn= new ArrayList<>();
//        phn.add("94894894");
//        Student s1=new Student(1,"Anand",phn);
//        System.out.println(s1);
//        s1.getPhones().add("84874994");
//        s1.getPhones().add("73636737");
//        s1.setId(1);
//        s1.setName("Anand");
//        System.out.println(s1);

//        s1.setId(2);
//        s1.setName("Andy");
//        System.out.println(s1);

        Address address=new Address("patna","bihar","India","120001");
        Employee employee=new Employee(1,"Anand",address);

        System.out.println(employee);

        Address address1 = employee.getAddress();
        address1.setCity("Noida");
        address1.setState("Up");
        address1.setCountry("USA");

        System.out.println(employee);
    }
}
