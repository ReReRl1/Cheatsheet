package org.example.Enum;

public enum Groesse {

    KLEIN(0.20, 100),
    MITTEL(0.50, 200),
    GROSS(1.00, 300);


    final double geFullmenge;
    final int menge;

    Groesse(double geFullmenge, int menge) {

        this.geFullmenge = geFullmenge;
        this.menge = menge;
    }

    public double getGeFullmenge() {
        return geFullmenge;
    }
    public int getMenge() {

        return menge;
    }
}
