package org.example.Klassen.Abstract;

public class Main {

    public static void main(String[] args) {

        Katze cat = new Katze("Askja", 13);
        Hund dog = new Hund("Jack", 5);


        dog.makeNoise();
        cat.makeNoise();
        dog.keineAhnung();
        cat.keineAhnung();

    }
}
