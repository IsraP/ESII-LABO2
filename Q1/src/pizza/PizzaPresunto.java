package pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaPresunto implements IPizza {

    public List<String> ingredientes;

    public PizzaPresunto(){
        ingredientes = Arrays.asList("queijo ", "presunto ", "tomate");
    }

    @Override
    public List<String> getIngredientes() {
        return ingredientes;
    }
}
