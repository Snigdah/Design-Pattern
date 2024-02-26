package factory;

import server.ingredient.cheese.Cheese;
import server.ingredient.crust.Crust;
import server.ingredient.sauce.Sauce;
import server.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
    Crust createCrust();
    Sauce createSauce();
    Cheese createCheese();
}
