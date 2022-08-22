package aula45;

public class Professor extends Usuario {
    private double salario;
    private String curso;

    public Professor(String nome, String telefone) {
        // O uso da palavra super permite repassar os parametros para a superclasse através do construtor.
        super(nome, telefone);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    // Este método foi sobreescrito da superclasse.
    public String gerarEtiquetaDeEndereço(){
        return "Endereço do Professor: " + super.getEndereco();
    }
}