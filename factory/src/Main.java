import client.PizzaOrderingSystem;
import factory.PizzaFactory;
import factory.PizzaFactoryImpl;
import server.Pizza;


public class Main {
    public static void main(String[] args) {

        // Creating a SimplePizzaFactory
        PizzaFactory pizzaFactory = new PizzaFactoryImpl();

        // Creating a PizzaOrderingSystem with the SimplePizzaFactory
        PizzaOrderingSystem pizzaOrderingSystem = new PizzaOrderingSystem(pizzaFactory);


        // Ordering different types of pizzas
        Pizza pizza1 = pizzaOrderingSystem.orderPizza("Margherita");
        System.out.println();

        Pizza pizza2 = pizzaOrderingSystem.orderPizza("Pepperoni");
        System.out.println();

        Pizza pizza3 = pizzaOrderingSystem.orderPizza("Hawaiian");
        System.out.println();

        Pizza pizza4 = pizzaOrderingSystem.orderPizza("Vegetarian");
    }
}