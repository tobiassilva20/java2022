package aula41;

// Com o uso da palavra chave abstract, a classe se torna abstrata, ou seja, não pode ser instanciada diretamente mas a
//apenas suas subclasses podem.
public abstract class Usuario {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

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

    public abstract String gerarEtiquetaDeEndereço();

    public abstract void exemploDeMetodoAbstrato();
}