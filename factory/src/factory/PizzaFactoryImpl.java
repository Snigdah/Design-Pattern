package factory;

import server.Pizza;
import server.impl.HawaiianPizza;
import server.impl.MargheritaPizza;
import server.impl.PepperoniPizza;
import server.impl.VegetarianPizza;

public class PizzaFactoryImpl implements PizzaFactory{
    public Pizza createPizza(String type) {
        switch (type) {
            case "Margherita":
                return new MargheritaPizza();
            case "Pepperoni":
                return new PepperoniPizza();
            case "Hawaiian":
                return new HawaiianPizza();
            case "Vegetarian":
                return new VegetarianPizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type.");
        }
    }
}
