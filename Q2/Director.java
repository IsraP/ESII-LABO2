package builder;

public class Director {
    public void constructContatoCompleto(Builder builder, String nome, String email, String endereco, String telefone) {
        builder.setEmail(email);
        builder.setEndereco(endereco);
        builder.setNome(nome);
        builder.setTelefone(telefone);
    }

    public void constructContatoInternet(Builder builder, String nome, String email) {
        builder.setEmail(email);
        builder.setNome(nome);
    }

    public void constructContatoTelefone(Builder builder, String nome, String telefone) {
        builder.setTelefone(telefone);
        builder.setNome(nome);
    }
}
