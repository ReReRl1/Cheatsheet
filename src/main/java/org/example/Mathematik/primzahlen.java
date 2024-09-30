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

            zahl = ein / i;
            p = ein % i;

            while (p == 1) {

                while (k) {



                }

                if (p == 0) {

                    System.out.println(zahl + " ist keine Primzahl" + "weil kann durch " + i + " geteilt werden");

                }
            }




        }


    }

}
