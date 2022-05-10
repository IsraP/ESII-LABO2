import pizza.IPizza;
import pizza.PizzaCalabresa;
import pizzaria.IPizzaria;
import pizzaria.PizzariaCalabresa;
import pizzaria.PizzariaPresunto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PizzariaApplication {
    IPizzaria pizzaria;

    public PizzariaApplication(IPizzaria pizzaria){
        this.pizzaria = pizzaria;
    }

    public void printMenu(){
        if(pizzaria != null) {
            String nomePizza = pizzaria.createPizza().getNome();
            String nomeCalzone = pizzaria.createCalzone().getNome();
            List<String> ingredientesPizza = pizzaria.createPizzaiolo().cozinharPizza().getIngredientes();
            List<String> ingredientesCalzone = pizzaria.createPizzaiolo().cozinharCalzone().getIngredientes();

            System.out.println("Pizza do dia: " + nomePizza);
            System.out.println("Ingredientes: " + ingredientesPizza);
            System.out.println("Calzone do dia: " + nomeCalzone);
            System.out.println("Ingredientes: " + ingredientesCalzone);
        }
        else
            System.out.println("Pizzaria fechada.");
    }
}
