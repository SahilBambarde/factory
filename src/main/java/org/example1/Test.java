package org.example1;

public class Test {
    public static void main(String[] args) {
        CarFactory factory= new CarFactory();
        Car c1 = factory.getCar("SUV");
        c1.assemble();

        Car c2 = factory.getCar("Sedan");
        c2.assemble();

        Car c3 = factory.getCar("Mini");
        c3.assemble();

    }
}
