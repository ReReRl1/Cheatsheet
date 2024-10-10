package org.example.Enum;

//*Übungsaufgabe: Enums in Java**
//
//        **Aufgabenstellung:**
//Du arbeitest für ein Unternehmen, das ein Bestellsystem für ein Café entwickeln möchte. Ein Teil dieses Systems soll die verschiedenen Kaffeetypen und deren Größen verwalten. Du sollst dafür ein Enum erstellen, das die Kaffeetypen und Größen repräsentiert und zusätzliche Informationen wie Preis und Füllmenge enthält.
//
//**Aufgabe:**
//
//        1. Erstelle ein Enum `KaffeeTyp`, das folgende Kaffeetypen enthält:
//        - ESPRESSO
//    - LATTE
//    - CAPPUCCINO
//    - AMERICANO
//
//2. Jeder Kaffeetyp soll einen Standardpreis und eine Standardfüllmenge (in Millilitern) haben. Diese Informationen sollen über den Konstruktor des Enums gesetzt werden.
//
//        3. Erstelle ein Enum `Groesse`, das folgende Größen für den Kaffee enthält:
//        - KLEIN
//    - MITTEL
//    - GROSS
//
//4. Jede Größe soll einen Aufpreis gegenüber dem Basispreis des Kaffees haben:
//        - KLEIN: kein Aufpreis
//    - MITTEL: 0.50€
//    - GROSS: 1.00€

public enum KaffeTyp {

    ESPRESSO(1.30,60),
    LATTE(1.50, 100),
    CAPPUCCINO(1.30, 110),
    AMERICANO(1.20, 120);

    final double preis;
    final int fullmenge;

    KaffeTyp(double preis, int fullmenge) {
        this.preis = preis;
        this.fullmenge = fullmenge;
    }
    public double getPreis(double preis) {

        return preis;
    }
    public int getFullmenge() {

        return fullmenge;
    }
}


