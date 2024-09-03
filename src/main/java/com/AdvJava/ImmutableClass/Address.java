package com.AdvJava.ImmutableClass;

public class Address {
    private String city;
    private String state;
    private String country;
    private  String pin;


    public Address(String city, String state,String country,String pin) {
        this.city = city;
        this.state = state;
        this.country=country;
        this.pin=pin;
    }



    public Address (Address address){
        this.country=address.getCountry();
        this.state=address.getState();
        this.city=address.getCity();
        this.pin= address.getPin();;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
