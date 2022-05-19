package aula42;

// Com o uso da palavra reservada final, definimos que uma classe não pode ser extendida ou seja não pode ser superclasse.
public  final class Usuario {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Usuario() {
    }

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

    //public abstract String gerarEtiquetaDeEndereço();

    //public abstract void exemploDeMetodoAbstrato();
}