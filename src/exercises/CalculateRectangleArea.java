package exercises;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Height?");
        int height = input.nextInt();

        System.out.println("Width?");
        int width = input.nextInt();

        int area = width*height;
        System.out.println("Area is " + area);

        input.close();

    }
}
