package pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaCalabresa implements IPizza {
    private List<String> ingredientes;
    private String nome;

    public PizzaCalabresa(){
        nome = "Pizza de calabresa";
        ingredientes = Arrays.asList("queijo", "calabresa", "tomate");
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
