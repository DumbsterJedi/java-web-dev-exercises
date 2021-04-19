package org.launchcode.java.demos.lsn1datatypes;

//import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
//        double fahrenheit;
//        double celsius = (fahrenheit - 32) * 5/9;;
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;

        input.close();

//        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
