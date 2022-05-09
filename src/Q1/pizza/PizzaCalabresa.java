package Q1.pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaCalabresa implements Ipizza{

    public List<String> ingredientes;

    public PizzaCalabresa(){
        ingredientes = Arrays.asList("queijo ", "calabresa ", "tomate");
    }

    @Override
    public List<String> getIngredientes() {
        return ingredientes;
    }
    
}
