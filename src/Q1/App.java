package Q1;

import Q1.pizza.PizzaCalabresa;

public class App {
    public static void main(String[] args) {
        PizzaCalabresa pc = new PizzaCalabresa();
        pc.getIngredientes().forEach(System.out::println);
    }
}
