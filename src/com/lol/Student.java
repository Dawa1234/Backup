package com.lol;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private int id;
    List<Address> address;

    public Student(String name, int age,int id, List<Address> address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
