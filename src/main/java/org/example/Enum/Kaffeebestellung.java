package org.example.Enum;

public class Kaffeebestellung {



    Groesse groesse;
    double gesamt;
    KaffeTyp kaffeTyp;

    int gesamtmenge;
//5. Schreibe eine Klasse `KaffeeBestellung`, die eine Bestellung eines Kaffees mit Typ und Größe repräsentiert. Diese Klasse soll:
//            - Den Kaffeetyp und die Größe speichern.
//            - Eine Methode `berechnePreis()` enthalten, die den Gesamtpreis auf Basis des Kaffeetyps und der Größe berechnet.
//    - Eine Methode `zeigeDetails()`, die die Details der Bestellung (Kaffeetyp, Größe, Preis und Füllmenge) auf der Konsole ausgibt.

    Kaffeebestellung(Groesse groesse, KaffeTyp kaffeTyp) {

        super();
        this.groesse = groesse;
        this.kaffeTyp = kaffeTyp;

    }



    public int berechneMenge() {

       gesamtmenge = kaffeTyp.fullmenge + groesse.menge;


        return gesamtmenge;
    }
    public void bestellungOut() {
        gesamt = groesse.geFullmenge + kaffeTyp.preis;
        System.out.format("%.2f", gesamt);
    }
    public void zeigeDetails() {

        System.out.println("bestellter Kaffe " + kaffeTyp);
        System.out.println("bestellte Größe " + groesse);

        System.out.println("Gesamtmenge " + gesamtmenge);

    }
}
