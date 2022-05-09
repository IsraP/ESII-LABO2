package pizzaiolo;

import Q1.pizza.Ipizza;
import Q1.pizza.PizzaCalabresa;

public class PizzaioloCalabresa implements IPizzaiolo {

    @Override
    public Ipizza cozinharPizza() {
        return new PizzaCalabresa();
    }
    
}
