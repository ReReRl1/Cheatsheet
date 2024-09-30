package org.example.Klassen.Abstract;

public class Hund extends Animal {

    public Hund(String name, int age) {

        this.age = age;
        this.name = name;



    }
    @Override
    public void makeNoise() {
        System.out.println("WAU WAU!");
    }
}
