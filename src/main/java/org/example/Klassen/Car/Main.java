package org.example.Klassen.Car;

public class Main {

    public static void main(String[] args) {


        Car mercedes = new Car("Mercedes", "cls", "grey", 20000.99, 100.99, false, 100);
//        Car audi = new Car("audi", "a7", "black");


    mercedes.carStart();
        System.out.println(mercedes.getFuel());
        mercedes.drive();
        mercedes.drive();
        mercedes.drive();
        System.out.println(mercedes.getFuel());
        mercedes.carOff();




//        mercedes.setBrand("mercedes");
//        mercedes.setModel("CLS");
//        mercedes.setColor("yellow");
////        mercedes.setKm(20.5);
////        mercedes.setPrice(46000);
//
//        mercedes.carStart();
//        System.out.println(mercedes.getKm());
//
//        mercedes.drive();
//
//        mercedes.carOff();
////        System.out.println(mercedes.getBrand());
////        System.out.println(mercedes.getColor());
////        System.out.println(mercedes.getModel());
//        System.out.println(mercedes.getKm());
////        System.out.println(mercedes.getPrice());
    }
}
