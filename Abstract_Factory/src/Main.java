import client.PizzaOrderingSystem;
import client.PizzaOrderingSystemFactory;
import server.pizza.Pizza;

public class Main {
    public static void main(String[] args) {

        // Creating a PizzaOrderingSystem with the NewYorkStylePizzaFactory
        PizzaOrderingSystem newYorkPizzaOrderingSystem = PizzaOrderingSystemFactory.createPizzaOrderingSystem("New York Style");

        // Ordering different types of pizzas in New York Style
        Pizza newYorkCheesePizza = newYorkPizzaOrderingSystem.orderPizza("Cheese");
        System.out.println();

        // Creating a PizzaOrderingSystem with the ChicagoStylePizzaFactory
        PizzaOrderingSystem chicagoPizzaOrderingSystem = PizzaOrderingSystemFactory.createPizzaOrderingSystem("Chicago Style");

        // Ordering different types of pizzas in Chicago Style
        Pizza chicagoCheesePizza = chicagoPizzaOrderingSystem.orderPizza("Cheese");
    }
}