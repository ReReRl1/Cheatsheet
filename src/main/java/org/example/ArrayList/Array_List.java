package org.example.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List {
    // ArrayList erstellen
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        //Methoden
        list.add("Hallo");
        list.add(1, "Welt");       //Fügt "Welt" an der Stelle 1 ein
        list.get(0);                            //Gibt das Element an der Stelle 0 aus
        list.set(0, "Servus");                  //Ersetzt das Element an der Stelle 0 mit "Servus"
        list.remove(1);                   //Löscht das Element an der Stelle 0
        list.remove("Hallo");                //Löscht das Element "Hallo"
        list.size();                            //Gibt die Anzahl der Elemente in der Liste aus
        list.contains("Hallo");                 //Gibt true zurück, wenn "Hallo" in der Liste enthalten ist
        list.indexOf("Hallo");                  //Gibt den Index des Elements "Hallo" zurück
        list.clear();                           //Löscht alle Elemente aus der Liste
        list.isEmpty();                         //Gibt true zurück, wenn die Liste leer ist
        list.toArray();                         //Gibt ein Array mit allen Elementen der Liste zurück
        list.toString();                        //Gibt eine String-Repräsentation der Liste zurück
        list.subList(0, 2);                     //Gibt eine Liste mit den Elementen von Index 0 bis 2 zurück
        list.addAll(list);                      //Fügt alle Elemente der Liste list an das Ende der Liste an
        list.addAll(1, list);              //Fügt alle Elemente der Liste list an der Stelle 1 ein
        list.retainAll(list);                   //Entfernt alle Elemente aus der Liste, die nicht in list enthalten sind

        //Ausgabe
        System.out.println(list.toString());    //Gibt die Liste als String aus, wenn list keine Strings enthält
        System.out.println(list);               //Gibt die Liste als String aus, wenn list Strings enthält

        for (String ausgabe : list) {           //Iteriert über die Liste
            System.out.println(ausgabe);
        }

        ListIterator<String> myList = list.listIterator();  //ListIterator kann rückwärts iterieren
        while (myList.hasNext()) {
            System.out.println(myList.next());
        }
    }
}