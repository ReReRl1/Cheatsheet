package org.example.ArrayList.Uebungen;

/*
 * Aufgabe: "Zahlen zur Liste hinzufügen und sortieren"
 * Schreibe ein Java-Programm, das:
 * Eine ArrayList von Integer erstellt mit den Zahlen: {25, 89, 12, 45, 78, 34, 56, 90, 23, 67}
 * Die Liste aufsteigend sortiert und in der Konsole ausgibt.
 *
 * Zusatz-1: Der Benutzer soll Zahlen vor der Sortierung hinzufügen können.
 * Zusatz-2: Der Benutzer soll entscheiden können, ob die Liste aufsteigend oder absteigend sortiert werden soll.
 * Zusatz-3: Der Benutzer soll nach Ausgabe der Liste Zahlen entfernen können.
 */

import java.util.*;

public class Sortierung {


    static ArrayList<Integer> zahlen = new ArrayList<>(Arrays.asList(25, 89, 12, 45, 78, 34, 56, 90, 23, 67));
    static boolean allAdded = false;
    static boolean sorted = false;
    static boolean deleted = false;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (!allAdded) {
            askToAdd(scanner);
        }

        while (!sorted) {
            sort(scanner);
        }

        while (!deleted) {

            delete(scanner);
        }

//        for (int i : zahlen) {                eine untereinander Iterrierte Ausgabe
//
//            System.out.println(i);
//        }


    }

    public static void delete(Scanner scanner) {

        System.out.println("möchten Sie Zahlen entfernen?  dann drücken Sie: J | N");
        Scanner del = new Scanner(System.in);

        switch (del.next()) {

            case "J":
                System.out.println("welche Zahl wollen Sie entfernen");
                try {
                    int zahl = scanner.nextInt();

                    if (zahlen.contains(zahl)) {
                        zahlen.remove(Integer.valueOf(zahl));

                        System.out.println(zahlen);

                    } else {

                        System.out.println("Zahl existiert nicht");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ungültige Eingabe");
                    break;
                }
            case "N":
                System.out.println(zahlen);
                deleted = true;
                break;
            default:

                System.out.println("Keine Gültige Eingabe");

                break;

        }
    }

    public static void askToAdd(Scanner scanner) {
        System.out.println("Möchten Sie eine Zahl hinzufügen?  J | N");

        switch (scanner.next()) {
            case "J":
                System.out.println("Geben Sie die Zahl ein, die Sie hinzufügen möchten:");
                zahlen.add(scanner.nextInt());
                break;
            case "N":
                allAdded = true;
                break;
            default:
                System.out.println("Ungültige Eingabe.");
                break;
        }

    }

    public static void sort(Scanner scanner) {

        System.out.println("möchten Sie die Ausgabe Aufsteigend oder Absteigend  Auf | Ab");


        switch (scanner.next()) {


            case "Auf":
                Collections.sort(zahlen);               //kann nebeneinander Iterieren aufwaehrts (hochzaehlen)
                System.out.println(zahlen);

                sorted = true;
                break;

            case "Ab":
                zahlen.sort(Comparator.reverseOrder());  //kann nebeneinander Iterieren abwaehrts (runterzaehlen)
                System.out.println(zahlen);
                //was ich der Methode gebe, muss Arr
                sorted = true;
                break;
            //ListIterator<Integer> rueck = zahlen.listIterator(zahlen.size());  ListIterator kann rückwärts iterieren
//            while (rueck.hasPrevious()) {
//             System.out.println(rueck.previous());
//            }

            default:

                System.out.println("Keine gultige Angabe");
                break;
        }

    }
}

