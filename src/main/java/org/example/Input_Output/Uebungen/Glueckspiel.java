package org.example.Input_Output.Uebungen;

import java.util.Objects;
import java.util.Scanner;
//Schreibt ein Programm welches mit einer Wahrscheinlichkeit von 42% "Gewonnen!" und ansonsten "Verloren!" ausgibt.
public class Glueckspiel {
    public static int ein1;
    public static boolean l = true;
    public static boolean k = true;
    public static int ein2;


    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);

        System.out.println("Willkommen zum Glückspiel 2024!");
        while (l) {
        System.out.println("Spieler 1: Geben Sie einen zufälligen Wert zwischen 1 - 100 ein!");


            ein1 = userEingabe.nextInt();

            if (ein1 > 100) {
                System.out.println("Keine Valide Eingabe");
            } else if (ein1 < 1) {
                System.out.println("Keine Valide Eingabe");
            }   else {
                l = false;
            }
        }
        while (k) {
            System.out.println("Spieler 2: Geben Sie einen zufälligen Wert zwischen 1 - 100 ein!");


            ein2 = userEingabe.nextInt();

            if (ein2 > 100) {
                System.out.println("Keine Valide Eingabe");
            } else if (ein2 < 1) {
                System.out.println("Keine Valide Eingabe");
            }   else {
                k = false;
            }
        }

        int diff1 = Math.abs(random() - ein1);
        int diff2 = Math.abs(random() - ein2);

        System.out.println("Die zufallszahl lautet: " + random());

        if (diff1 < diff2) {
            System.out.println("Spieler 1 hat gewonnen!");
        } else {
            System.out.println("Spieler 2 hat gewonnen!");
        }




    }

public static int random() {
    int gluckZahl;

    gluckZahl =  (int)(Math.random() * 100) + 10;

    return gluckZahl;
}
}
