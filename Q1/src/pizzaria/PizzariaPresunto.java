package pizzaria;

import calzone.CalzonePresunto;
import calzone.ICalzone;
import pizza.IPizza;
import pizza.PizzaPresunto;
import pizzaiolo.IPizzaiolo;
import pizzaiolo.PizzaioloPresunto;

public class PizzariaPresunto implements IPizzaria{
    @Override
    public IPizzaiolo createPizzaiolo() {
        return new PizzaioloPresunto();
    }

    @Override
    public IPizza createPizza() {
        return new PizzaPresunto();
    }

    @Override
    public ICalzone createCalzone() {
        return new CalzonePresunto();
    }
}
