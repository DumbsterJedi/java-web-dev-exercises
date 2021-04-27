package org.launchcode.java.studios.resturantMenu;

import java.util.ArrayList;

public class Menu {
    static private String date = "4/26/21";
    static private ArrayList<MenuItem> Appetizers = new ArrayList<>();
    static private ArrayList<MenuItem> MainCourse = new ArrayList<>();
    static private ArrayList<MenuItem> Dessert = new ArrayList<>();

    static MenuItem sudzu = new MenuItem("Sudzu","Gummybears, milk, pure genuis","Dessert",34.80);

    private static void addToMenu(MenuItem item){
        if(item.category.equals("App")){
        Appetizers.add(item);
        } else if (item.category.equals("Main")){
            MainCourse.add(item);
        } else if (item.category.equals("Dessert")){
            Dessert.add(item);
        };
    }
    public static void main(String[] args) {
    addToMenu(sudzu);
        System.out.println(Dessert.get(0).description);
        System.out.println("Menu was updated: " + date);
    }

}
