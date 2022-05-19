package aula42;

// Como a classe usuário passou a ser final, as subclasses perdem a herança dos atributos e métodos dela
public class Professor extends MetodosFinal{
    private double salario;
    private String curso;

    public Professor() {
    }

    public Professor(String nome, String telefone) {
        // O uso da palavra super permite repassar os parametros para a superclasse através do construtor.
        //super(nome, telefone);
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
        return "Endereço do Professor: ";
    }

    //@Override
    public void exemploDeMetodoAbstrato() {}

    // O método abaixo pertencente à superclasse não pode ser sobrescrito por estar assinado como final
    /*
    public void testeFinalEmMetodos(){

        return;
    }*/
}