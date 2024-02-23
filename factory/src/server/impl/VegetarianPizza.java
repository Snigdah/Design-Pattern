package server.impl;

import server.Pizza;

public class VegetarianPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Vegetarian Pizza");
    }
    public void bake() {
        System.out.println("Baking Vegetarian Pizza");
    }
    public void cut() {
        System.out.println("Cutting Vegetarian Pizza");
    }
    public void box() {
        System.out.println("Boxing Vegetarian Pizza");
    }
}
