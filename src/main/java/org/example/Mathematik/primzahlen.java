package org.example.Mathematik;

import java.util.ArrayList;
import java.util.Scanner;

public class primzahlen {

    public static int p;
    public static int zahl;
    public static boolean k = false;

    public static void main(String[] args) {

        Scanner userEingabe = new Scanner(System.in);

        System.out.println("welche primzahl wollen Sie Testen? ");


        int ein = userEingabe.nextInt();


        for (int i = 2; i <= ein; i++) {

            boolean isPrimzahl = true;


            for (int j = 2; j < i && isPrimzahl; j++) {


                if ((i % j) == 0) {


                    isPrimzahl = false;
                }

            }
            if (ein == i) {


                if (isPrimzahl) {
                    System.out.println(i + " ist eine Primzahl!");
                } else {
                    System.out.println(i + " ist keine Primzahl!");
                }
            }
        }

    }
}
