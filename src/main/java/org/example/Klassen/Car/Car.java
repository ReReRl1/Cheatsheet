package org.example.Klassen.Car;

public class Car {

    //Attribute
    private String brand;
    private String model;
    private String color;
    private double price;
    private double km;
    private boolean status;

    //Konstruktor
    public Car(String brand, String model, String color, double price, double km, boolean status) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.km = km;
        this.status = false;

    }

    public Car(String brand, String model, String color) {      //Anhand der Parameter welcher Konstruktor für das
        //Objekt genommen wird

        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    //Methoden
    public void carStart() {

        status = true;
        System.out.println("Auto gestartet");
    }


    public void drive() {
        if (status) {
            System.out.println("auto fährt");
            km += 100;
        } else {
            System.out.println("Auto vorher bitte starten");
        }

    }
    public void carOff() {

        status = false;
        System.out.println("Auto aus");
    }

        //getter setter
    public String getModel() {

        return model;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getKm() {
        return km;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
