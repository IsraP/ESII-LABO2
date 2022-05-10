package calzone;

import java.util.Arrays;
import java.util.List;

public class CalzonePresunto implements ICalzone{
    private List<String> ingredientes;
    private String nome;

    public CalzonePresunto(){
        nome = "Calzone de presunto";
        ingredientes = Arrays.asList("massa", "presunto");
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
