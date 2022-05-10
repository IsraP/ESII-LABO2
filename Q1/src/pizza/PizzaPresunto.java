package pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaPresunto implements IPizza {
    private List<String> ingredientes;
    private String nome;

    public PizzaPresunto(){
        nome = "Pizza de presunto";
        ingredientes = Arrays.asList("queijo", "presunto", "tomate");
    }

    @Override
    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
