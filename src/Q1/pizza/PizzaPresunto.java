package Q1.pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaPresunto implements Ipizza {

    public List<String> ingredientes;

    public PizzaPresunto(){
        ingredientes = Arrays.asList("queijo ", "presunto ", "tomate");
    }

    @Override
    public List<String> getIngredientes() {
        return ingredientes;
    }
}
