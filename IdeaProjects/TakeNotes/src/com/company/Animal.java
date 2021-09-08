package com.company;

abstract public class Animal {
    private String Name;
    private int Foot;
    private boolean IsKind;

    public Animal(String name, int foot, boolean isKind) {
        Name = name;
        Foot = foot;
        IsKind = isKind;
    }

    public void eat (String food) {
        System.out.println("Eating " + food);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getFoot() {
        return Foot;
    }

    public void setFoot(int foot) {
        Foot = foot;
    }

    public boolean isKind() {
        return IsKind;
    }

    public void setKind(boolean kind) {
        IsKind = kind;
    }
}
