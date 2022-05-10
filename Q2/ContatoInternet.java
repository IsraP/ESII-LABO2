package builder;

public class ContatoInternet {
    private String nome;
    private String email;

    public ContatoInternet(String nome, String email) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + "\nEmail: " + email + "\n");
    }
}
