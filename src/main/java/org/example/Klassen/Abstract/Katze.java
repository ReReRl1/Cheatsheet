package org.example.Klassen.Abstract;

public class Katze extends Animal {


    public Katze(String name, int age) {

        this.age = age;
        this.name = name;

    }
    @Override
    public void makeNoise() {

        System.out.println("MIAU MIAU!");

    }
}
