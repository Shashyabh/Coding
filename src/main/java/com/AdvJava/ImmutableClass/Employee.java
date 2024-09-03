package com.AdvJava.ImmutableClass;

public final class Employee {
    private final int id;
    private final String name;
    private final Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public Address getAddress() {
//        //return address;
//        return new Address(address.getCity(),address.getState(),address.getCountry());
//    }

    public Address getAddress() {
        return new Address(address);
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
