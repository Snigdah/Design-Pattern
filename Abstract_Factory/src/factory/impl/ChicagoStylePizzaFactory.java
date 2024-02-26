package factory.impl;

import factory.PizzaFactory;
import server.ingredient.cheese.Cheese;
import server.ingredient.cheese.impl.MozzarellaCheese;
import server.ingredient.crust.Crust;
import server.ingredient.crust.impl.ThickCrust;
import server.ingredient.sauce.Sauce;
import server.ingredient.sauce.impl.DeepDishSauce;
import server.pizza.Pizza;
import server.pizza.impl.ChicagoStyleCheesePizza;

public class ChicagoStylePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new ChicagoStyleCheesePizza(createCrust(), createSauce(), createCheese());
            // Handle other types of pizzas for Chicago Style
            default:
                throw new IllegalArgumentException("Invalid pizza type.");
        }
    }

    public Crust createCrust() {
        return new ThickCrust();
    }

    public Sauce createSauce() {
        return new DeepDishSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
