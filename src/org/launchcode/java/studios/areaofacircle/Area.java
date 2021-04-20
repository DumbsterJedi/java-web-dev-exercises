package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

    while(true) {
        System.out.println("What is radius?");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        if(radius < 0){
        System.out.println("No, can't be negative.");

        } else {
        double area = Circle.getArea(radius);
        System.out.println(area);
        break;}

    }
    }
}
