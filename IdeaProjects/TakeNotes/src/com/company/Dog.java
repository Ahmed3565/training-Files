package com.company;

public class Dog extends Animal{

    private boolean IsPlay;

    public Dog (String name, int foot, boolean iskind) {
        super(name, foot, iskind);
    }

    public void setPlay (Boolean play) {
        this.IsPlay = play;
    }

    public boolean getPlay () {
        return this.IsPlay;
    }
}
