package org.launchcode.java.studios.resturantMenu;

import java.util.Objects;

public class MenuItem {

        private String name;
        private String description;
        private String category;
        private double price;
        private boolean isNew;

        MenuItem(String name, String description,String category,double price){
            this.name = name;
            this.description = description;
            this.category = category;
            this.price = price;
            this.isNew = true;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getIsNew(){
            return isNew;
    }

    public void isNew(boolean isNew) {
        this.isNew = isNew;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, description, category, price, isNew);
    }

    public boolean areItemsEqual(MenuItem o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MenuItem menuItem = (MenuItem) o;
            return Double.compare(menuItem.price, price) == 0 && isNew == menuItem.isNew && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
        }

}

