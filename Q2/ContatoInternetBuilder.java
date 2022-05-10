package builder;

public class ContatoInternetBuilder implements Builder {
    private String nome;
    private String email;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContatoInternet getResult() {
        return new ContatoInternet(nome, email);
    }

    @Override
    public void setTelefone(String telefone) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEndereco(String endereco) {
        // TODO Auto-generated method stub

    }
}
