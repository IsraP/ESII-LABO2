package pizzaria;

import calzone.ICalzone;
import pizza.IPizza;
import pizzaiolo.IPizzaiolo;

public interface IPizzaria {
    IPizzaiolo createPizzaiolo();
    IPizza createPizza();
    ICalzone createCalzone();
}
