package factory;

import server.Pizza;

// Pizza Factory interface
public interface PizzaFactory {
    Pizza createPizza(String type);
}
