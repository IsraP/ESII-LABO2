package builder;

public class ContatoCompleto {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public ContatoCompleto(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\nEmail: " + email + "\n");
    }
}
