package com.company;

public class StartPoint {
    public static void main(String[] args) {
        Dog shiwawa = new Dog("shiwawa" , 4 , true);

        System.out.println(shiwawa.getName());
        shiwawa.eat("meat");
        shiwawa.setPlay(true);
        System.out.println(shiwawa.getPlay());
    }
}
