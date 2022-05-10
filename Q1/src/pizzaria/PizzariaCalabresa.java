package pizzaria;

import calzone.CalzoneCalabresa;
import calzone.ICalzone;
import pizza.IPizza;
import pizza.PizzaCalabresa;
import pizzaiolo.IPizzaiolo;
import pizzaiolo.PizzaioloCalabresa;

public class PizzariaCalabresa implements IPizzaria{
    @Override
    public IPizzaiolo createPizzaiolo() {
        return new PizzaioloCalabresa();
    }

    @Override
    public IPizza createPizza() {
        return new PizzaCalabresa();
    }

    @Override
    public ICalzone createCalzone() {
        return new CalzoneCalabresa();
    }
}
