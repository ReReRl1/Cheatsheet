package org.example.Enum;

public class Main {

    public static void main(String[] args) {



     Kaffeebestellung d = new Kaffeebestellung(Groesse.KLEIN, KaffeTyp.ESPRESSO);


        d.berechneMenge();

        d.zeigeDetails();
        d.bestellungOut();
    }
}
