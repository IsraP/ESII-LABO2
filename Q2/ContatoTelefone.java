package builder;

public class ContatoTelefone {
    private String nome;
    private String telefone;

    public ContatoTelefone(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + "\nTelefone: " + telefone + "\n");
    }
}
