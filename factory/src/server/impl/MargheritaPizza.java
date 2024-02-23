package server.impl;

import server.Pizza;

// Concrete Pizza classes
public class MargheritaPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Margherita Pizza");
    }
    public void bake() {
        System.out.println("Baking Margherita Pizza");
    }
    public void cut() {
        System.out.println("Cutting Margherita Pizza");
    }
    public void box() {
        System.out.println("Boxing Margherita Pizza");
    }
}
