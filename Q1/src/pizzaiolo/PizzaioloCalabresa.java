package pizzaiolo;

import calzone.CalzoneCalabresa;
import calzone.ICalzone;
import pizza.IPizza;
import pizza.PizzaCalabresa;

public class PizzaioloCalabresa implements IPizzaiolo {

    @Override
    public IPizza cozinharPizza() {
        return new PizzaCalabresa();
    }

    @Override
    public ICalzone cozinharCalzone() {
        return new CalzoneCalabresa();
    }

}
