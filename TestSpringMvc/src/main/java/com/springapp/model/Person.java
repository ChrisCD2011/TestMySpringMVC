package com.springapp.model;

/**
 * Created by Chris on 2016-02-22.
 */
public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
