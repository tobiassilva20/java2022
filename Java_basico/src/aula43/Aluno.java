package aula43;

import aula42.MetodosFinal;

// Como a classe usuário passou a ser final, as subclasses perdem a herança dos atributos e métodos dela
public class Aluno extends MetodosFinal {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String telefone) {
        // O uso da palavra super permite repassar os parametros para a superclasse através do construtor.
        //super(nome, telefone);
    }

    public Aluno() {}

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
        return "Endereço do Aluno: ";
    }


    //@Override
    public void exemploDeMetodoAbstrato() {}

    // O método abaixo pertencente à superclasse não pode ser sobrescrito por estar assinado como final
    /*
    public void testeFinalEmMetodos(){

        return;
    }*/


    // O método toString pertence a classe Object
    @Override
    public String toString() {
        String s = "Aluno: Nome do Aluno";
        s += "\nCurso: " + this.getCurso() + "\n";
        s += "Notas: ";
        for (double nota: this.getNotas()) {
            s += " " + nota + " ; ";
        }
        return s;
    }
}