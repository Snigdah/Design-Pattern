package client;

import factory.PizzaFactory;
import server.pizza.Pizza;

public class PizzaOrderingSystem {
    private PizzaFactory pizzaFactory;

    public PizzaOrderingSystem(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
