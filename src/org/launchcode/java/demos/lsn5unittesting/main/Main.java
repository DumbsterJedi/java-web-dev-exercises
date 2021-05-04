package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Supra", 13, 14);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}
