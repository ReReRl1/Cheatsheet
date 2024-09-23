package org.example.Input_Output;

import javax.smartcardio.TerminalFactory;
import java.util.Scanner;

public class Eigenes_Menue {


    public static void main(String[] args) {


        System.out.println("Wie lautet ihr Name?");
        String name = System.console().readLine();


        String geschlecht;
        Scanner userEingabe = new Scanner(System.in); // auch ueber Scanner moeglich

        System.out.println("Bitte geben Sie ihr Geschlecht an");
        System.out.println("M | W | D");
        String auswahl = userEingabe.next();


        //name = userEingabe.next();
        System.out.println("Hallo " + geschlecht + name);


        System.out.println("Gib mir eine Zahl");
        int zahl = userEingabe.nextInt();

        System.out.println(zahl);



        public String auswahlG() {

            switch (auswahl) {
                case "M":

                    geschlecht = "Herr ";

                case "W":

                    geschlecht = "Weiblich ";

                case "D":

                    geschlecht = "";

                default:

                    System.out.println("Keine Valide eingabe");



            }

        }


    }
}