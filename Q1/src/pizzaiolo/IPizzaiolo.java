package pizzaiolo;

import calzone.ICalzone;
import pizza.IPizza;

public interface IPizzaiolo {
    IPizza cozinharPizza();
    ICalzone cozinharCalzone();
}
