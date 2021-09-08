package com.company;

public class People {
    private String Name;
    private int Age;

    public People(String name, int age) {
        Name = name;
        Age = age;
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getName () {
        return Name;
    }
    public int getAge () {
        return Age;
    }
}
