package builder;

public class ContatoCompletoBuilder implements Builder {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContatoCompleto getResult() {
        return new ContatoCompleto(nome, endereco, telefone, email);
    }

}
