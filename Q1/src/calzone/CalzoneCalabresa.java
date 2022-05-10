package calzone;

import java.util.Arrays;
import java.util.List;

public class CalzoneCalabresa implements ICalzone{
    private List<String> ingredientes;
    private String nome;

    public CalzoneCalabresa(){
        nome = "Calzone de calabresa";
        ingredientes = Arrays.asList("massa", "calabresa");
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
