package org.example.Klassen.Car;

public class Car {

    //Attribute
    private String brand;
    private String model;
    private String color;
    private double price;
    private double km;
    private boolean engineStatus;
    private int fuel;
    //Konstruktor
    public Car(String brand, String model, String color, double price, double km, boolean status, int fuel) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.km = km;
        this.engineStatus = false;
        this.fuel = fuel;
    }

    public Car(String brand, String model, String color) {      //Anhand der Parameter welcher Konstruktor für das
        //Objekt genommen wird

        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    //Methoden
    public void carStart() {

        engineStatus = true;
        System.out.println("Auto gestartet");
    }


    public void drive() {

        if (engineStatus && fuel >= 10) {
            System.out.println("auto fährt");
            km += 100;
            fuel -= 10;
        } else {
            System.out.println("Auto vorher bitte starten");
        }

    }
    public void carOff() {

        engineStatus = false;
        System.out.println("Auto aus");
    }

        //getter setter
   public int getFuel() {

        return fuel;
   }
   public void setFuel() {

        this.fuel = fuel;
   }
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
