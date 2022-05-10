import pizzaria.IPizzaria;
import pizzaria.PizzariaCalabresa;
import pizzaria.PizzariaPresunto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Consumidor {
    public static PizzariaApplication configApp(){
        IPizzaria pizzaria = null;

        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        dtf = dtf.withLocale(Locale.ENGLISH);

        LocalDate date = LocalDate.parse(scan.nextLine(), dtf);

        if(Arrays.asList(1, 3, 5).contains(date.getDayOfWeek().getValue()))
            pizzaria = new PizzariaCalabresa();

        else if(Arrays.asList(2, 4, 6).contains(date.getDayOfWeek().getValue()))
            pizzaria = new PizzariaPresunto();

        scan.close();

        return new PizzariaApplication(pizzaria);
    }

    public static void goToPizzaria(PizzariaApplication app){
        app.printMenu();
    }

    public static void main(String[] args) {
        PizzariaApplication app = configApp();

        goToPizzaria(app);
    }
}
