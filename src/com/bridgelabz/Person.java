package com.bridgelabz;

public class Person {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    Long phoneNum;
    String email;
    Person(String firstName, String lastName, String address,
           String city, String state, String zip, Long phoneNum, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNum = phoneNum;
        this.email = email;

    }
}
