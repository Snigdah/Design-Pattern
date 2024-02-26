package client;

import factory.PizzaFactory;
import factory.impl.ChicagoStylePizzaFactory;
import factory.impl.NewYorkStylePizzaFactory;

public class PizzaOrderingSystemFactory {
    public static PizzaOrderingSystem createPizzaOrderingSystem(String style) {
        PizzaFactory factory;

        switch (style) {
            case "New York Style":
                factory = new NewYorkStylePizzaFactory();
                break;
            case "Chicago Style":
                factory = new ChicagoStylePizzaFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza style.");
        }

        return new PizzaOrderingSystem(factory);
    }
}
