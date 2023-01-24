package com.company;

// This is a class used to explain encapsulation
// Private key word is used to restrict the access to the class properties
// Helps us to define ways in which the given class properties can be accessed

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age,  String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
}
