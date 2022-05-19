package aula39;

// Esta classe contem métodos e atributos comuns que deverão ser herdados pelas subclasses
public class Usuario {

    public Usuario() {
    }

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    // Este atributo default está visível apenas dentro de classes do mesmo pacote.
    String atributo_default;

    // Este atributo protected está visível apenas dentro de classes do mesmo pacote.
    protected String atributo_protected;

    // Este atributo private está visível apenas dentro da própria classe a qual ele pertence.
    private String atributo_private;

    // Este atributo public está visível por todas as classes, inclusive fora do pacote.
    public String atributo_public;
    public Usuario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
