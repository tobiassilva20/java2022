package aula37;

// Para fazer uso da herança no Java utiliza-se a palavra reservada extends.
public class Aluno extends Usuario{

    private String curso;
    private double[] notas;

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

    public double calcularMedia(){
        return 0;
    }

    public boolean varificarSeEstaAprovado(){
        return true;
    }
}
