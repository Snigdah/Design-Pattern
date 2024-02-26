package factory.impl;

import factory.PizzaFactory;
import server.ingredient.cheese.Cheese;
import server.ingredient.cheese.impl.MozzarellaCheese;
import server.ingredient.crust.Crust;
import server.ingredient.crust.impl.ThinCrust;
import server.ingredient.sauce.Sauce;
import server.ingredient.sauce.impl.MarinaraSauce;
import server.pizza.Pizza;
import server.pizza.impl.NewYorkStyleCheesePizza;

public class NewYorkStylePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new NewYorkStyleCheesePizza(createCrust(), createSauce(), createCheese());
            // Handle other types of pizzas for New York Style
            default:
                throw new IllegalArgumentException("Invalid pizza type.");
        }
    }

    public Crust createCrust() {
        return new ThinCrust();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
