package org.example.Input_Output.Uebungen;

import java.util.Objects;
import java.util.Scanner;
//Schreibt ein Programm welches mit einer Wahrscheinlichkeit von 42% "Gewonnen!" und ansonsten "Verloren!" ausgibt.
public class Glueckspiel {

    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);

        System.out.println("Wie lautet ihr Name?");
        String name = userEingabe.nextLine();  // Use Scanner for input

        String geschlecht = auswahlG(userEingabe);  // Get gender from method



        System.out.println("Gib mir eine Zahl");
        int zahl = userEingabe.nextInt();
        if (zahl < 18)
            System.out.println("Hallo " + name + "!");
        else if (zahl > 18 && zahl < 110) {
            if (Objects.equals(geschlecht, "Herr"))
            System.out.println("Sehr geehrter " + geschlecht + name + "!");
        } else  {

            System.out.println("Sehr geehrte " + geschlecht + name + "!");
        }
        userEingabe.close();  // Close the scanner to prevent resource leaks
    }
    //
    public static String auswahlG(Scanner scanner) {
        String geschlecht = "";
        System.out.println("Bitte geben Sie ihr Geschlecht an");
        System.out.println("M | W | D");
        String auswahl = scanner.next();

        switch (auswahl) {
            case "M":
                geschlecht = "Herr ";
                break;
            case "W":
                geschlecht = "Frau ";
                break;
            case "D":
                geschlecht = "Divers ";
                break;
            default:
                System.out.println("Keine valide Eingabe");
                break;
        }
        return geschlecht;  // Return the gender
    }
public int random() {
    int gluckZahl;

    gluckZahl = (int) Math.random() * 100;
    return gluckZahl;
}
}
