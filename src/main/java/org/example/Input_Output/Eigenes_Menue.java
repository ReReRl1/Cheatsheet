package org.example.Input_Output;

import java.util.Scanner;

public class Eigenes_Menue {

    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);

        System.out.println("Wie lautet ihr Name?");
        String name = userEingabe.nextLine();  // Use Scanner for input

        String geschlecht = auswahlG(userEingabe);  // Get gender from method

        System.out.println("Hallo " + geschlecht + name);

        System.out.println("Gib mir eine Zahl");
        int zahl = userEingabe.nextInt();
        System.out.println("Die eingegebene Zahl ist: " + zahl);

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
                break;  // Prevent fall-through
            case "W":
                geschlecht = "Frau ";
                break;  // Prevent fall-through
            case "D":
                geschlecht = "Divers ";
                break;  // Prevent fall-through
            default:
                System.out.println("Keine valide Eingabe");
                break;
        }
        return geschlecht;  // Return the gender
    }
}