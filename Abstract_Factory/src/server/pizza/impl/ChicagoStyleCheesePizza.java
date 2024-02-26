package server.pizza.impl;

import server.ingredient.cheese.Cheese;
import server.ingredient.crust.Crust;
import server.ingredient.sauce.Sauce;
import server.pizza.Pizza;

public class ChicagoStyleCheesePizza implements Pizza {
    private Crust crust;
    private Sauce sauce;
    private Cheese cheese;

    public ChicagoStyleCheesePizza(Crust crust, Sauce sauce, Cheese cheese) {
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    public void prepare() {
        System.out.println("Preparing Chicago Style Cheese Pizza with " + crust.getCrust() + ", " + sauce.getSauce() + ", and " + cheese.getCheese());
    }

    public void bake() {
        System.out.println("Baking Chicago Style Cheese Pizza");
    }

    public void cut() {
        System.out.println("Cutting Chicago Style Cheese Pizza");
    }

    public void box() {
        System.out.println("Boxing Chicago Style Cheese Pizza");
    }
}

