package builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ContatoCompletoBuilder builder = new ContatoCompletoBuilder();
        director.constructContatoCompleto(builder, "Luiza", "luiza@gmail.com", "Rua Conselheiro Lafaiete",
                "3199999-9999");
        ContatoCompleto contatoCompleto = builder.getResult();
        System.out.print(contatoCompleto.toString());

        System.out.println("------------------------------------------");

        ContatoInternetBuilder builder2 = new ContatoInternetBuilder();
        director.constructContatoInternet(builder2, "Luiza", "luiza2@gmail.com");
        ContatoInternet contatoInternet = builder2.getResult();
        System.out.print(contatoInternet.toString());

        System.out.println("------------------------------------------");

        ContatoTelefoneBuilder builder3 = new ContatoTelefoneBuilder();
        director.constructContatoTelefone(builder3, "Luiza", "(31)99999-9999");
        ContatoTelefone contatoTelefone = builder3.getResult();
        System.out.print(contatoTelefone.toString());

        // Resultados encontrados:
        // Nome: Luiza
        // Endereco: Rua Conselheiro Lafaiete
        // Telefone: 3199999-9999
        // Email: luiza@gmail.com
        // ------------------------------------------
        // Nome: Luiza
        // Email: luiza2@gmail.com
        // ------------------------------------------
        // Nome: Luiza
        // Telefone: (31)99999-9999
    }
}
