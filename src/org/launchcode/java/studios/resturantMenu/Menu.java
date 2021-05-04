package org.launchcode.java.studios.resturantMenu;

import java.util.ArrayList;

public class Menu {
    static private String date = "4/26/21";
    static private ArrayList<MenuItem> Appetizers = new ArrayList<>();
    static private ArrayList<MenuItem> MainCourse = new ArrayList<>();
    static private ArrayList<MenuItem> Dessert = new ArrayList<>();

    static MenuItem sudzu = new MenuItem("Sudzu","Gummy bears, milk, pure genius.","Dessert",34.80);

    private static void addToMenu(MenuItem item){
        if(item.getCategory().equals("App")){
        Appetizers.add(item);
        } else if (item.getCategory().equals("Main")){
            MainCourse.add(item);
        } else if (item.getCategory().equals("Dessert")){
            Dessert.add(item);
        };
    }

    private static void removeItem(MenuItem item){
        if (Appetizers.contains(item)) {
            Appetizers.remove(Appetizers.indexOf(item));
        }
        if (MainCourse.contains(item)) {
            MainCourse.remove(MainCourse.indexOf(item));
        }
        if (Dessert.contains(item)) {
            Dessert.remove(Dessert.indexOf(item));
        }
    }


    private static boolean isItemNew(MenuItem item){
        return item.getIsNew();
    }

    private static String lastUpdated(){
        return date;
    }

    private static String print (MenuItem item){
        String printedItem = String.format("%s: %s Price: $%s",item.getName(), item.getDescription(),item.getPrice());
        return printedItem;
    }

    private static ArrayList print(){
        ArrayList<String> fullMenu = new ArrayList<>();
//        for(int i = 0; i < Appetizers.size(); i++){
//        fullMenu.add(String.format("%s: %s Price: $%s",Appetizers.get(i).getName(), Appetizers.get(i).getDescription(),Appetizers.get(i).getPrice()));
//        }
//        for(int i = 0; i < MainCourse.size(); i++){
//        fullMenu.add(String.format("%s: %s Price: $%s",Appetizers.get(i).getName(), Appetizers.get(i).getDescription(),Appetizers.get(i).getPrice()));
//        }
        for(int i = 0; i < Dessert.size(); i++){
        fullMenu.add(String.format("%s: %s Price: $%s",Dessert.get(i).getName(), Dessert.get(i).getDescription(),Dessert.get(i).getPrice()));
        }
        return fullMenu;
    }



    public static void main(String[] args) {
        addToMenu(sudzu);
        System.out.println(Dessert.get(0).getDescription());
        System.out.println("Menu was updated: " + date);
        System.out.println(print());
        System.out.println(Dessert.get(0).getName());
        removeItem(sudzu);
    }

}
