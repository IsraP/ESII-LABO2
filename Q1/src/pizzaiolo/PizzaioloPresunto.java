package pizzaiolo;

import Q1.pizza.Ipizza;
import Q1.pizza.PizzaCalabresa;
import Q1.pizza.PizzaPresunto;

public class PizzaioloPresunto implements IPizzaiolo {
    @Override
    public Ipizza cozinharPizza() {
        return new PizzaPresunto();
    }
}
