package aula45;

// Para fazer uso da herança no Java utiliza-se a palavra reservada extends.
public class Aluno extends Usuario {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String telefone) {
        // O uso da palavra super permite repassar os parametros para a superclasse através do construtor.
        super(nome, telefone);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean varificarSeEstaAprovado() {
        return true;
    }

    // Este método foi sobreescrito da superclasse.
    public String gerarEtiquetaDeEndereço() {
        return "Endereço do Aluno: " + super.getEndereco();
    }
}