package com.company.collections;

public class Students {
    private String Name;
    private int Id;
    private double Degree;

    public Students (String name , int id , double degree) {
        this.Name = name;
        this.Id = id;
        this.Degree = degree;
    }

    public String getName () {
        return Name;
    }
    public int getId () {
        return Id;
    }
    public double getDegree () {
        return Degree;
    }
}
