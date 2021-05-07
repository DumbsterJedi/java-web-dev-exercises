package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
//        Comparator comparator = new FlavorComparator(); //replaced on line 18
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        for(int i = 0; i < flavors.size();i++){
            System.out.println(flavors.get(i).getName());
        }
        System.out.println("\n");

        flavors.sort(new FlavorComparator());

        for(int i = 0; i < flavors.size();i++){
            System.out.println(flavors.get(i).getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        for(int i = 0; i < cones.size();i++){
            System.out.println(cones.get(i).getCost());
        }
        System.out.println("\n");
        cones.sort(new ConeComparator());
        for(int i = 0; i < cones.size();i++){
            System.out.println(cones.get(i).getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
