package builder;

public class ContatoTelefoneBuilder implements Builder {
    private String nome;
    private String telefone;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContatoTelefone getResult() {
        return new ContatoTelefone(nome, telefone);
    }

    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEndereco(String endereco) {
        // TODO Auto-generated method stub

    }
}
