package org.example.Kontrollstrukturen;

public class Verschachtelte_Schleifen {


    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {


            int erg = i;
            System.out.println(i + "" + "x " + "1 " + "= " + erg);
            for (int j = 1; j <= 10; j++) {

            erg = i * j;

                System.out.println(i + "" + "x " + j + " = " + erg);
            }

        }
    }
}
