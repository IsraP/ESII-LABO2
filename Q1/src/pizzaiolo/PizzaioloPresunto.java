package pizzaiolo;

import calzone.CalzoneCalabresa;
import calzone.CalzonePresunto;
import calzone.ICalzone;
import pizza.IPizza;
import pizza.PizzaPresunto;

public class PizzaioloPresunto implements IPizzaiolo {
    @Override
    public IPizza cozinharPizza() {
        return new PizzaPresunto();
    }

    @Override
    public ICalzone cozinharCalzone() {
        return new CalzonePresunto();
    }
}
