package Q1.pizzaiolo;

import Q1.pizza.Ipizza;
import Q1.pizza.PizzaCalabresa;

public class PizzaioloCalabresa implements Ipizzaiolo{

    @Override
    public Ipizza cozinharPizza() {
        return new PizzaCalabresa();
    }
    
}
